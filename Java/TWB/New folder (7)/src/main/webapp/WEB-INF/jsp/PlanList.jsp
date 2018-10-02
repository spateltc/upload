<!DOCTYPE html>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <title> Charts </title>
  <script src="http://ajax.googleapis.bootcss.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.3.0/Chart.bundle.js"></script>
  <script src="https://cdn.jsdelivr.net/angular.chartjs/latest/angular-chart.min.js"></script>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-filter/0.5.16/angular-filter.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.4.0/angular-route.min.js"></script>
  <head>
      <title>List Of Programs</title>
      <script src="assets/js/controller/planController.js"></script>
        <link href="assets/css/metrotiles.css" rel="stylesheet" />
  </head>

  <body class="container-fluid ">
  <div ng-app="planListApp">

  <div class="panel panel-success">
      <div class="panel-heading">
          <div class="panel-title text-center">Plan List</div>
      </div>
        <section>
      <div class="panel-body container-fluid">



              <div class="row well" id="section1">

                     <div class="col-sm-20" ng-controller="PlanListController">
                       <div class="tileplan blue" ng-repeat="name in planList">
                    <!--     <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                           <section ng-controller="PlanListController" class="">
                          <div class="row">
                              <div class="col-md-12">-->
                              <a ng-href="testTypes?plan={{name.planName}}">{{name.planName}}</a>
                              <!--  <p ng-repeat="x in programList">{{x}}</p>
                                <li ng-repeat="item in response.data">
                                  <a href="#">{{item}}</a>
                                  </li>-->
                                </div>
                              </div>
                          </div>
                    </div>
          </section>

      </div>
  </div>
  </body>

  </html>
