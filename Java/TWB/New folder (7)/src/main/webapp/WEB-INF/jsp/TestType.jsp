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
      <title>List Of Plans</title>
      <link href="assets/css/responstable.css" rel="stylesheet" />
      <script src="assets/js/controller/TestTypeController.js"></script>
      <style>
      .panel-body {
        padding: 30px !important;}
  </style>
  </head>

  <body   class="container-fluid ">
  <div ng-app="testTypeListApp">

  <div ng-controller="TestTypeController" class="panel panel-success">
      <div class="panel-heading">
          <div class="panel-title text-center">{{title}}</div>
      </div>

      <div class="panel-body container-fluid" style="padding: 30px;">

          <section>


                      <section  class="">
                             <div class="row">
                              <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                               <div class="panel-heading">
                                    <div class="panel-title text-center">Launch Gating Defects</div>
                                </div>
                              <div id="LG">

                              <table border="1" class="responstable" id="LG1" >
                                <thead>
                                  <th ng-repeat="(header, value) in lgData[0]">{{header}}</th>
                             </thead>
                             <tbody>
                              <tr ng-repeat="row in lgData">
                               <td ng-repeat="cell in row">{{cell}}</td>
                              </tr>
                             </tbody>
                           </table>
                         </div></div>
                           <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                               <div class="panel-heading">
                                    <div class="panel-title text-center">All Defects</div>
                                </div>
                              <div id="all">

                              <table border="1" class="responstable" id="all1" >
                                <thead>
                                  <th ng-repeat="(header, value) in defectsData[0]">{{header}}</th>
                             </thead>
                             <tbody>
                              <tr ng-repeat="row in defectsData">
                               <td ng-repeat="cell in row">{{cell}}</td>
                              </tr>
                             </tbody>
                           </table>
                         </div>
                           </div>
                         </div>
                         
                          <div class="row">
                              <div class="col-md-30">
                                <!--<ul>-->
								<div ng-repeat="type in uniqueTestTypes">
								<!--{{type}}-->
                <div class="panel-heading">
                    <div class="panel-title text-center">{{type}}</div>
                </div>
                   
                    <div ng-repeat="name in testTypeList">
                    <!--  <div ng-repeat="n in [] | range:uniqueTestTypeLen">
								             <div class="row well" ng-if="name[1]===uniqueTestTypes[n]">-->
                                <!--  {{name[0]}}
                              <div id=type ng-bind="ng-init="callAPI(name[0],name[1],name[2]">-->
                          
                             
                              <div class="row well" ng-if="name[1]===type">
                                <div class="panel-heading">
                                    <div class="panel-title text-center">{{name[0]}}</div>
                                </div>
                                  <div class="row well">
                                <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                              <div  id={{name[1]}} ng-repeat="datapie in pieChartData track by $index">
                                  <canvas id={{name[1]}} ng-if="name[0]===datapie.cycle && name[1]===datapie.testtype"
                                        class="chart chart-pie" chart-data=datapie.data
                                          chart-labels=datapie.labels chart-options="optionsPie"
                                          chart-colors=datapie.colorsPie chart-options="optionsPie"
                                          chart-click="clickme" chart-hover="hoverme"
                                          chart-dataset-override="PieDataSetOverride">
                                  </canvas>
                                </div></div>
                                <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                                <div id={{name[1]}} ng-repeat="databar in barChartData track by $index">
                              

                                  <canvas id={{name[1]}} ng-if="name[0]===databar.cycle && name[1]===databar.testtype"
                                        class="chart chart-horizontal-bar" chart-data=databar.data
                                          chart-labels=databar.labels chart-options="optionsBar"
                                          chart-colors="colorsBar">
                                  </canvas>
                                </div>
                                </div>
                                </div>

                            <!--  </div> ng-if="name[0]===datapie[1] && name[1]===datapie[2]"-->
                          <!--    <div class="row">
                                  <div class="col-md-12">
id={{name[1]}} ng-if="name[0]===table.cycle && name[1]===table.testtype"
                                  </div> class="responstable"
                              </div> -->
                              <div class="row well">
                              
                              <div id={{name[1]}} ng-repeat="table in reportData track by $index">

                              <table border="1" class="responstable" id={{name[1]}} ng-if="name[0]===table.cycle && name[1]===table.testtype">
                                <thead>
                                  <th ng-repeat="(header, value) in table.record[0]">{{header}}</th>
                             </thead>
                             <tbody>
                              <tr ng-repeat="row in table.record">
                               <td ng-repeat="cell in row">{{cell}}</td>
                              </tr>
                             </tbody>
                           </table>
                         </div></div>
</div>
                 </div>
									 <!-- <div ng-if="name[1] === 'SIT Regression'"> SIT Regression
                                   <br>  {{name[0]}}.</br>
									 </div>
									  <div ng-if="name[1] === 'Automated'"> Automated
                                   <br>  {{name[0]}}.</br>
									 </div> -->
                                 <!-- </li>-->
								<!--  </li>-->
								</div>
								<br/>
                               <!-- </ul>-->
                              <!--  <p ng-repeat="x in programList">{{x}}</p>
                                <li ng-repeat="item in response.data">
                                  <a href="#">{{item}}</a>
                                  </li>-->
                              </div>
                          </div>
                      </section>

          </section>

      </div>
  </div>
</div>
  </body>

  </html>
