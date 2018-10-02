var app = angular.module('programListApp',["ngRoute"]);

app.controller('ProgramListController', function($scope, $http,$location){

 $http({
 method: "GET",
// url:"http://10.118.5.248:8081/TWB/ords/preprod/getProgramNames",
 url: "/TWB/ords/preprod/getProgramNames",
 dataType: 'json',
}).then(function (response) {$scope.programList = response.data;
 // alert(response.data);

});

//  $scope.programList = ['A','B','C','D','E','F','G','H','I','J'];
/*$scope.go = function ( path ) {
  $location.path( path );
};*/

});

app.config(function ($routeProvider){$routeProvider.
  when('/Sample/PlanList.html?program=:name', {
    templateUrl: 'PlanList.html',
    controller: 'planController'
});});



/*  $http.get("http://10.118.5.248:8081/TWB/ords/preprod/getProgramNames")
  .then(function(response){
    //$scope.programList = response.data;
    alert(response.data.toString());
  /*  var dd = response.data.toString();
    var pmArray = [];
           var inputArray = dd.split(',');
           for (var i = 0; i < inputArray.length; i++) {
               pmArray.push({inputArray[i]});
             }*/
              //  $scope.programList = response.data;
  /*   app.filter('customSplitString', function() {
   var arr = response.data.split(',');
   $scope.programList = arr;*/
