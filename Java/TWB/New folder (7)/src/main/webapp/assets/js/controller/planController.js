  var app1 = angular.module('planListApp',["ngRoute"]);

  /*app1.controller('PlanListController',

  function($scope, $routeParams) {
     $scope.param = $routeParams.param;
     alert($routeParams.param);
  });

  function($scope,$window,$rootScope, $cookies,$cookieStore,$location){
  var searchObject = $location.search();

    alert("parameter is :.."+searchObject.param);
      $scope.param = searchObject.param;

    });*/

   app1.controller('PlanListController',function($scope, $http,$location){
     var searchObject = $location.absUrl().split('=');;
     // alert("parameter is :.."+searchObject[0]);
      //alert("parameter is :.."+searchObject[1]);
      var programname = searchObject[1].split('#');

    $http({
   method: "POST",
  // url: "http://10.118.5.248:8081/TWB/ords/preprod/listtestplan/",
  url: "/TWB/ords/preprod/listtestplan/",
   headers: {'Content-Type': 'application/json'},
   dataType: 'json',
   data:{'test_plan_type':programname[0]}
  }).then(function (response) {$scope.planList = response.data;
    //alert(response.data);
    //alert(programname[0]);
  });

  });

  /*app1.controller("RouteController", function($scope, $routeParams) {
      $scope.param = $routeParams.param;
      alert($routeParams.param);
  });*/
