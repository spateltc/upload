var app1 = angular.module('testTypeListApp',['ngRoute','chart.js']);
var pieCount=-1;
var barCount=-1;
var tableCount=-1;
var lgtableCount=-1;

app1.filter('range', function() {
  return function(input, total) {
    total = parseInt(total);
    for (var i=0; i<total; i++)
      input.push(i);
    return input;
  };
});
app1.controller('TestTypeController', function($scope, $http,$location){

 var searchObject = $location.absUrl().split('=');;
//   ////alert("parameter is :.."+searchObject[0]);
//   //alert("parameter is :.."+searchObject[1]);
   var planname = searchObject[1].split('#');
   $scope.title=decodeURIComponent(planname);
  $http({
 method: "GET",
// url: "http://10.118.5.248:8081/TWB/ords/preprod/distinctDataForDsr?planName="+planname[0],
 url: "/TWB/ords/preprod/distinctDataForDsr?planName="+planname[0],
 headers: {'Content-Type': 'application/json'},
 dataType: 'json'
}).then(function (response) {$scope.testTypeList = response.data;
  //////alert(response.data);
var arr=[];
angular.forEach($scope.testTypeList,function(value,index){
              arr.push(value[1]);

			 // //alert(arr);
           });
 $scope.uniqueTestTypes = [];
$.each(arr, function(i, el){
    if($.inArray(el, $scope.uniqueTestTypes) === -1) $scope.uniqueTestTypes.push(el);
});
$scope.uniqueTestTypeLen = $scope.uniqueTestTypes.length;
	////alert($scope.uniqueTestTypes);
	////alert($scope.testTypeList);
  angular.forEach($scope.testTypeList,function(value,index){
	          callAPI_LGDefectsWebTable(value[2]);
	          callAPI_AllDefectsWebTable(value[2]);
              callAPI_PieChart(value[0],value[1],value[2]);
              callBarChartAPI(value[0],value[1],value[2]);
              callAPI_WebTable(value[0],value[1],value[2]);
             
             });

  function callAPI_LGDefectsWebTable(planname){
      $scope.lgData = Array();
   $http({
      method: "POST",
      url: "/TWB/ords/preprod/getLGDefectsStatusCount/",
      headers: {'Content-Type': 'application/json'},
      dataType: 'json',
      data:{'plan_name':planname}
    }).then(function (response) {$scope.lgwebTableData = response.data;
       //alert("LG Defects="+ response.data);
    lgtableCount = lgtableCount+1;
   $scope.lgData = response.data;
 });
        };
  
        function callAPI_AllDefectsWebTable(planname){
            $scope.defectsData = Array();
         $http({
            method: "POST",
            url: "/TWB/ords/preprod/getAllDefectsStatusCount/",
            headers: {'Content-Type': 'application/json'},
            dataType: 'json',
            data:{'plan_name':planname}
          }).then(function (response) {$scope.defectswebTableData = response.data;
         
         $scope.defectsData = response.data;
       });
              };
             function callAPI_PieChart(cycle,testtype,planname){
               $scope.pieChartData = Array();
               $scope.reportData = Array();
              $http({
                method: "POST",
                url: "/TWB/ords/preprod/piechart/",
                headers: {'Content-Type': 'application/json'},
                dataType: 'json',
                data:{
                'plan_name':planname,
                'cycle_name':cycle,
                'test_type': testtype }}).then(function (response) {$scope.pieData = response.data;
                  ////alert( response.data);
              /*  var d = [    {
                    "id": 0,
                    "status": "Passed",
                    "count": 30,
                    "color": "#55D45D"
                }]*/
                  var d = response.data;
                  //alert("piechart="+d);
                   pieCount = pieCount+1;
                  var id = Array();
                  var status = Array();
                  var count = Array();
                  var color = Array();
                  var dataArrayFinal = Array();
                   for(i=0;i<d.length;i++) {
                     id[i] = d[i].id;
                     status[i] = d[i].status;
                     count[i] = d[i].count;
                     color[i] = d[i].color;
                    }

            /*for(j=0;j<name.length;j++) {
               var temp = new Array(name[j],data[j]);
               dataArrayFinal[j] = temp;
            }*/

            labels=[];data=[]; colorsPie=[]; PieDataSetOverride=[];optionsPie=[];
                labels = status;
                data = count;
                  //Make sure to use color codes, instead of color name.
                colorsPie = color;
                  //PieDataSetOverride is used to draw lines to display the labels

                  $scope.PieDataSetOverride = [{ yAxisID: 'y-axis-1' }]; //y-axis-1 is the ID defined in scales under options.

                $scope.optionsPie = {
                      legend: { display: true },
                      responsive: true,  // set to false to remove responsiveness. Default responsive value is true.
                      scales: {
                          yAxes: [
                            {
                                id: 'y-axis-1',
                                type: 'linear',
                                display: true,
                                position: 'left'
                            }]
                      }
                  }


$scope.pieChartData[pieCount]={"labels":labels,"data":data,"colorsPie":colorsPie,"cycle":cycle,"testtype":testtype};
////alert($scope.pieChartData);

              });};
              function callAPI_WebTable(cycle,testtype,planname){
                $scope.reportData = Array();
             $http({
               method: "GET",
               url: "/TWB/ords/preprod/getReportDetails?planName="+planname+"&cycleName="+cycle+"&testType="+testtype,
               headers: {'Content-Type': 'application/json'},
               dataType: 'json',
              }).then(function (response) {$scope.webTableData = response.data;
                 ////alert( response.data);
                 tableCount = tableCount+1;
                 $scope.reportData[tableCount]={"record":response.data,"cycle":cycle,"testtype":testtype};
               });
                  };
                  
                  function callBarChartAPI(cycle,testtype,planname){
                      $scope.barChartData = Array();
                     
                     $http({
                    	 method: "GET",
                 	    url: "/TWB/ords/preprod/getbarChartDetails?planName="+planname+"&cycleName="+cycle+"&testType="+testtype,
                 	    headers: {'Content-Type': 'application/json'},
                 	    dataType: 'json'}).then(function (response) {$scope.barData = response.data;
                         ////alert( response.data);
                     /*  var d = [    {
                           "id": 0,
                           "status": "Passed",
                           "count": 30,
                           "color": "#55D45D"
                       }]*/
                         var bar = response.data;
                         //alert("bar chart data="+bar);
                         
                         //alert("component="+bar[0].component);
                          barCount = barCount+1;
                         var labelNames = Array();
                         var statusPassed = Array();
                         var statusFailed = Array();
                         var statusOthers = Array();
                         var completeDataArr=new Array();
                        // var count1 = Array();
                         var color1 = Array();
                         var dataArrayFinal1 = Array();
                         for(i=0;i<bar.length;i++) {
                        	 labelNames[i] = bar[i].component;//d1[i];
                            statusPassed[i] =bar[i].passed;// d1[i][1];
                            statusFailed[i] =bar[i].failed;//d1[i][2];
                            statusOthers[i]=bar[i].notcategorized;//d1[i][3];
                            }
                            completeDataArr[0] = statusPassed;
                            completeDataArr[1] = statusFailed;
                            completeDataArr[2] = statusOthers;
                            
                           // color1[i] = d1[i].color;
                           
                          //$scope.data=completeDataArr;
                   labels1=[];data1=[];  BarDataSetOverride=[];optionsBar=[];
                   //labelNames=["Passed", "Failed", "Others"];
                       labels1 = labelNames;
                      /*completeDataArr=[
                                        [10,20,5],
                                        [10,20,5],
                                        [10,20,5]
                                        ];*/
                      /* completeDataArr = {"cols": [
                                               {id: "month", label: "Month", type: "string"},
                                               {id: "laptop-id", label: "Laptop", type: "number"},
                                               {id: "desktop-id", label: "Desktop", type: "number"},
                                               {id: "server-id", label: "Server", type: "number"},
                                               {id: "cost-id", label: "Shipping", type: "number"}
                                           ], "rows": [
                                               {c: [
                                                   {v: "January"},
                                                   {v: (19/56)*100, f: "42 items"},
                                                   {v: (12/13)*100, f: "Ony 12 items"},
                                                   {v: (7/30)*100, f: "7 servers"},
                                                   {v: (4/14)*100}
                                               ]},
                                               {c: [
                                                   {v: "March"},
                                                   {v: (24/56)*100},
                                                   {v: (0/13)*100},
                                                   {v: (11/30)*100},
                                                   {v: (6/14)*100}

                                               ]}
                                           ]};*/

                       data1 = completeDataArr;
                         //Make sure to use color codes, instead of color name.
                      // colorsBar = color1;
                         //PieDataSetOverride is used to draw lines to display the labels
                       $scope.colorsBar=['#90EE90', '#FF6600', '#8080FF'];
                       //  $scope.BarDataSetOverride = [{ yAxisID: 'y-axis-1' }]; //y-axis-1 is the ID defined in scales under options.

                       $scope.optionsBar = {
                              
                    		   scales: {
                    			     xAxes: [{
                    			          stacked: true,
                    			     }],
                    			     yAxes: [{
                    			          stacked: true
                    			     }]
                    			}
                              
                           };


       $scope.barChartData[barCount]={"labels":labels1,"data":data1,"cycle":cycle,"testtype":testtype};
       ////alert($scope.pieChartData);

                     });

                 
                         };   
                  

});


});
