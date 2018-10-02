webpackJsonp([1],{

/***/ "../../../../../src async recursive":
/***/ (function(module, exports) {

function webpackEmptyContext(req) {
	throw new Error("Cannot find module '" + req + "'.");
}
webpackEmptyContext.keys = function() { return []; };
webpackEmptyContext.resolve = webpackEmptyContext;
module.exports = webpackEmptyContext;
webpackEmptyContext.id = "../../../../../src async recursive";

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "\n<style>\n    div.full { width: 100%; height: 100%; float: left; background: white; border:0.1px solid #d7dfe8; margin: auto;} \n    div.half { width: 50%; height: 50%; float: left; background: white; border:0.1px solid #d7dfe8; margin: auto;}\n    div.quarter { width: 100%; height: 75%; float: left; background: white; border:0.1px solid #d7dfe8;}\n</style>\n\n\n\n<div id=\"main\" class=\"main\" >\n<!--[class]=\"applyblue? 'half': 'orange'\"   -->\n\n<div *ngIf=\"count>=1\"  droppable (drop)=\"onDrop($event)\"  id=\"dropAreaText1\" (dblclick)=\"alter(1)\" [class]=\"classAlter[1]? 'full': 'half'\" >\n\n    <p [hidden]=\"!chartArray[1][0] || !chartArray[1][1] || !chartArray[1][2] \" > drop chart here </p>\n\n  <confirm [hidden]=\"chartArray[1][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n  <pie-chart-demo [hidden]=\"chartArray[1][0]\" id=\"pc1\" [data]=\"data[1]\"></pie-chart-demo> \n\n\n  <confirm [hidden]=\"chartArray[1][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\" (onConfirm)='handleOnConfirm($event)'></confirm>\n  <bar-chart-demo [hidden]=\"chartArray[1][1]\" [planName]=\"planNam\" id=\"pc1\" [data]=\"data[1]\" ></bar-chart-demo>\n  \n\n  <confirm [hidden]=\"chartArray[1][2]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n  <pie-chart-demo [hidden]=\"chartArray[1][2]\" id=\"pc1\" [data]=\"data[1]\"></pie-chart-demo>\n\n\n\n</div>\n\n\n<div *ngIf=\"count>=2\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText2\" (dblclick)=\"alter(2)\" [class]=\"classAlter[2]? 'full': 'half'\"  >\n     <p [hidden]=\"!chartArray[2][0] || !chartArray[2][1] || !chartArray[2][2] \" >drop chart here </p>\n\n<confirm [hidden]=\"chartArray[2][0]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>     \n <pie-chart-demo [hidden]=\"chartArray[2][0]\" id=\"pc2\" [data]=\"data[2]\"></pie-chart-demo>\n\n  \n<confirm [hidden]=\"chartArray[2][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>     \n <bar-chart-demo [hidden]=\"chartArray[2][1]\"  id=\"pc2\" [data]=\"data[2]\"  [planName]=\"planNam\" ></bar-chart-demo>\n\n <confirm [hidden]=\"chartArray[2][2]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>     \n <pie-chart-demo [hidden]=\"chartArray[2][2]\" id=\"pc2\" [data]=\"data[2]\"></pie-chart-demo>\n\n\n\n\n</div>\n\n\n<div *ngIf=\"count>=3\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText3\" (dblclick)=\"alter(3)\" [class]=\"classAlter[3]? 'full': 'half'\" >\n    <p  [hidden]=\"!chartArray[3][0] || !chartArray[3][1] || !chartArray[3][2]\">drop chart here </p>\n\n    <pie-chart-demo [hidden]=\"chartArray[3][0]\"  id=\"pc3\" [data]=\"data[3]\"></pie-chart-demo>\n     \n    <confirm [hidden]=\"chartArray[3][0]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n\n\n    \n    <bar-chart-demo [hidden]=\"chartArray[3][1]\" [planName]=\"planNam\" id=\"pc3\" [data]=\"data[3]\" ></bar-chart-demo>\n     \n    <confirm [hidden]=\"chartArray[3][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n\n\n    \n    <pie-chart-demo [hidden]=\"chartArray[3][2]\"  id=\"pc3\" [data]=\"data[3]\"></pie-chart-demo>\n     \n    <confirm [hidden]=\"chartArray[3][2]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n \n</div>\n\n<div  *ngIf=\"count>=4\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText4\" (dblclick)=\"alter(4)\" [class]=\"classAlter[4]? 'full': 'half'\" >\n     <p [hidden]=\"!chartArray[4][0] || !chartArray[4][1] || !chartArray[4][2]\" >drop chart here</p>\n    <pie-chart-demo [hidden]=\"chartArray[4][0]\" id=\"pc\" [data]=\"data[4]\"></pie-chart-demo>\n    \n    <confirm [hidden]=\"chartArray[4][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n\n\n      <bar-chart-demo [hidden]=\"chartArray[4][1]\" [planName]=\"planNam\" id=\"pc4\" [data]=\"data[4]\" ></bar-chart-demo>\n    \n    <confirm [hidden]=\"chartArray[4][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n       \n\n\n        <pie-chart-demo [hidden]=\"chartArray[4][2]\" id=\"pc\" [data]=\"data[4]\"></pie-chart-demo>\n    \n    <confirm [hidden]=\"chartArray[4][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n   \n</div>\n\n\n\n<div  *ngIf=\"count>=5\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText5\" (dblclick)=\"alter(5)\" [class]=\"classAlter[5]? 'full': 'half'\" >\n\n      <p [hidden]=\"!chartArray[5][0] || !chartArray[5][1] || !chartArray[5][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[5][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n       <pie-chart-demo [hidden]=\"chartArray[5][0]\" id=\"pc5\" [data]=\"data[5]\"></pie-chart-demo>\n\n       <confirm [hidden]=\"chartArray[5][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n       <bar-chart-demo [hidden]=\"chartArray[5][1]\" [planName]=\"planNam\" id=\"pc5\" [data]=\"data[5]\" ></bar-chart-demo>\n\n       <confirm [hidden]=\"chartArray[5][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n       <pie-chart-demo [hidden]=\"chartArray[5][2]\" id=\"pc5\" [data]=\"data[5]\"></pie-chart-demo>\n\n</div>\n\n\n<div  *ngIf=\"count>=6\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText6\" (dblclick)=\"alter(6)\" [class]=\"classAlter[6]? 'full': 'half'\" >\n      <p [hidden]=\"!chartArray[6][0] || !chartArray[6][1] || !chartArray[6][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[6][0]\"  [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[6][0]\" id=\"pc6\" [data]=\"data[6]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[6][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <bar-chart-demo [hidden]=\"chartArray[6][1]\" [planName]=\"planNam\" id=\"pc6\" [data]=\"data[6]\" ></bar-chart-demo>\n\n\n       <confirm [hidden]=\"chartArray[6][2]\"  [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[6][2]\" id=\"pc6\" [data]=\"data[6]\"></pie-chart-demo>\n\n</div>\n\n\n<div  *ngIf=\"count>=7\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText7\" (dblclick)=\"alter(7)\" [class]=\"classAlter[7]? 'full': 'half'\" >\n\n     <p [hidden]=\"!chartArray[7][0] || !chartArray[7][1] || !chartArray[7][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[7][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n       <pie-chart-demo [hidden]=\"chartArray[7][0]\" id=\"pc7\" [data]=\"data[7]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[7][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n       <bar-chart-demo [hidden]=\"chartArray[7][1]\" [planName]=\"planNam\" id=\"pc7\" [data]=\"data[7]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[7][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n       <pie-chart-demo [hidden]=\"chartArray[7][2]\" id=\"pc7\" [data]=\"data[7]\"></pie-chart-demo>\n\n</div>\n\n\n<div  *ngIf=\"count>=8\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText8\" (dblclick)=\"alter(8)\" [class]=\"classAlter[8]? 'full': 'half'\" >\n    <p [hidden]=\"!chartArray[8][0] || !chartArray[8][1] || !chartArray[8][2]\" >drop chart here</p>\n\n\n<confirm [hidden]=\"chartArray[8][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[8][0]\" id=\"pc8\" [data]=\"data[8]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[8][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <bar-chart-demo [hidden]=\"chartArray[8][1]\" [planName]=\"planNam\" id=\"pc8\" [data]=\"data[8]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[8][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[8][2]\" id=\"pc8\" [data]=\"data[8]\"></pie-chart-demo>\n\n</div>\n\n\n\n<div  *ngIf=\"count>=9\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText9\" (dblclick)=\"alter(9)\" [class]=\"classAlter[9]? 'full': 'half'\" >\n\n    <p [hidden]=\"!chartArray[9][0] || !chartArray[9][1] || !chartArray[9][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[9][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n      <pie-chart-demo [hidden]=\"chartArray[9][0]\" id=\"pc9\" [data]=\"data[9]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[9][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <bar-chart-demo [hidden]=\"chartArray[9][1]\" [planName]=\"planNam\" id=\"pc9\" [data]=\"data[9]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[9][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n      <pie-chart-demo [hidden]=\"chartArray[9][2]\" id=\"pc9\" [data]=\"data[9]\"></pie-chart-demo>\n\n\n</div>\n\n\n<div  *ngIf=\"count>=10\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText10\" (dblclick)=\"alter(10)\" [class]=\"classAlter[10]? 'full': 'half'\" >\n\n    <p [hidden]=\"!chartArray[10][0] || !chartArray[10][1] || !chartArray[10][2]\" >drop chart here</p>\n\n\n<confirm [hidden]=\"chartArray[10][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[10][0]\" id=\"pc10\" [data]=\"data[10]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[10][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n        <bar-chart-demo [hidden]=\"chartArray[10][1]\" [planName]=\"planNam\" id=\"pc10\" [data]=\"data[10]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[10][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[10][2]\" id=\"pc10\" [data]=\"data[10]\"></pie-chart-demo>\n\n</div>\n\n\n<div  *ngIf=\"count>=11\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText11\" (dblclick)=\"alter(11)\" [class]=\"classAlter[11]? 'full': 'half'\" >\n     <p [hidden]=\"!chartArray[11][0] || !chartArray[11][1] || !chartArray[11][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[11][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n       <pie-chart-demo [hidden]=\"chartArray[11][0]\" id=\"pc11\" [data]=\"data[11]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[11][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"   (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n      <bar-chart-demo [hidden]=\"chartArray[11][1]\" [planName]=\"planNam\" id=\"pc11\" [data]=\"data[11]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[11][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n       <pie-chart-demo [hidden]=\"chartArray[11][2]\" id=\"pc11\" [data]=\"data[11]\"></pie-chart-demo>\n\n</div>\n\n<div  *ngIf=\"count>=12\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText12\" (dblclick)=\"alter(12)\" [class]=\"classAlter[12]? 'full': 'half'\" >\n\n     <p [hidden]=\"!chartArray[12][0] || !chartArray[12][1] || !chartArray[12][2]\" >drop chart here</p>\n\n\n<confirm [hidden]=\"chartArray[12][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      <pie-chart-demo [hidden]=\"chartArray[12][0]\" id=\"pc12\" [data]=\"data[12]\"></pie-chart-demo>\n\n\n    \n<confirm [hidden]=\"chartArray[12][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"   (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n\n<bar-chart-demo [hidden]=\"chartArray[12][1]\" [planName]=\"planNam\" id=\"pc12\" [data]=\"data[12]\" ></bar-chart-demo>\n\n\n    \n<confirm [hidden]=\"chartArray[12][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n       <pie-chart-demo [hidden]=\"chartArray[12][2]\" id=\"pc12\" [data]=\"data[12]\"></pie-chart-demo>\n\n\n\n</div>\n\n\n<div  *ngIf=\"count>=13\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText13\" (dblclick)=\"alter(13)\" [class]=\"classAlter[13]? 'full': 'half'\" >\n      <p [hidden]=\"!chartArray[13][0] || !chartArray[13][1] || !chartArray[13][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[13][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[13][0]\" id=\"pc13\" [data]=\"data[13]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[13][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <bar-chart-demo [hidden]=\"chartArray[13][1]\" [planName]=\"planNam\" id=\"pc13\" [data]=\"data[13]\" ></bar-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[13][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[13][2]\" id=\"pc13\" [data]=\"data[13]\"></pie-chart-demo>\n\n\n</div>\n\n\n<div  *ngIf=\"count>=14\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText14\" (dblclick)=\"alter(14)\" [class]=\"classAlter[14]? 'full': 'half'\" >\n     <p [hidden]=\"!chartArray[14][0] || !chartArray[14][1] || !chartArray[14][2]\" >drop chart here</p>\n\n\n<confirm [hidden]=\"chartArray[14][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n       <pie-chart-demo [hidden]=\"chartArray[14][0]\" id=\"pc14\"  [data]=\"data[14]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[14][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n      <bar-chart-demo [hidden]=\"chartArray[14][1]\" [planName]=\"planNam\" id=\"pc14\" [data]=\"data[14]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[14][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n     \n       <pie-chart-demo [hidden]=\"chartArray[14][2]\" id=\"pc14\"  [data]=\"data[14]\"></pie-chart-demo>\n\n\n</div>\n\n\n<div  *ngIf=\"count>=15\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText15\" (dblclick)=\"alter(15)\" [class]=\"classAlter[15]? 'full': 'half'\" >\n       <p [hidden]=\"!chartArray[15][0] || !chartArray[15][1] || !chartArray[15][2]\" >drop chart here</p>\n\n\n<confirm [hidden]=\"chartArray[15][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n       <pie-chart-demo [hidden]=\"chartArray[15][0]\" id=\"pc15\" [data]=\"data[15]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[15][1]\" [chartName]=\"chartName\"  (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n       <bar-chart-demo [hidden]=\"chartArray[15][1]\" [planName]=\"planNam\" id=\"pc15\" [data]=\"data[15]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[15][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n   \n       <pie-chart-demo [hidden]=\"chartArray[15][2]\" id=\"pc15\" [data]=\"data[15]\"></pie-chart-demo>\n\n</div>\n\n<div  *ngIf=\"count>=16\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText16\" (dblclick)=\"alter(16)\" [class]=\"classAlter[16]? 'full': 'half'\" >\n\n      <p [hidden]=\"!chartArray[16][0] || !chartArray[16][1] || !chartArray[16][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[16][0]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[16][0]\" id=\"pc16\" [data]=\"data[16]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[16][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <bar-chart-demo [hidden]=\"chartArray[16][1]\" [planName]=\"planNam\" id=\"pc16\" [data]=\"data[16]\" ></bar-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[16][2]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[16][2]\" id=\"pc16\" [data]=\"data[16]\"></pie-chart-demo>\n\n</div>\n\n\n<div  *ngIf=\"count>=17\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText17\" (dblclick)=\"alter(17)\" [class]=\"classAlter[17]? 'full': 'half'\" >\n    <p [hidden]=\"!chartArray[17][0] || !chartArray[17][1] || !chartArray[17][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[17][0]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[17][0]\" id=\"pc17\" [data]=\"data[17]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[17][1]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n           <bar-chart-demo [hidden]=\"chartArray[17][1]\" (onDrawPlan)=\"getPlanName($event)\"  [planName]=\"planNam\" id=\"pc17\" [data]=\"data[17]\" ></bar-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[17][2]\" [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[17][2]\" id=\"pc17\" [data]=\"data[17]\"></pie-chart-demo>\n\n\n</div>\n\n\n<div  *ngIf=\"count>=18\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText18\" (dblclick)=\"alter(18)\" [class]=\"classAlter[18]? 'full': 'half'\" >\n\n    <p [hidden]=\"!chartArray[18][0] || !chartArray[18][1] || !chartArray[18][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[18][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[18][0]\" id=\"pc18\" [data]=\"data[18]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[18][1]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n           <bar-chart-demo [hidden]=\"chartArray[18][1]\"  (onDrawPlan)=\"getPlanName($event)\"  [planName]=\"planNam\" id=\"pc18\" [data]=\"data[18]\" ></bar-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[18][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[18][2]\" id=\"pc18\" [data]=\"data[18]\"></pie-chart-demo>\n\n\n</div>\n\n<div  *ngIf=\"count>=19\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText19\" (dblclick)=\"alter(19)\" [class]=\"classAlter[19]? 'full': 'half'\" >\n    <p [hidden]=\"!chartArray[19][0] || !chartArray[19][1] || !chartArray[19][2]\" >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[19][0]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[19][0]\" id=\"pc19\" [data]=\"data[19]\"></pie-chart-demo>\n\n\n\n<confirm [hidden]=\"chartArray[19][1]\"  [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n      <bar-chart-demo [hidden]=\"chartArray[19][1]\" [planName]=\"planNam\" id=\"pc19\" [data]=\"data[19]\" ></bar-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[19][2]\"  [chartName]=\"chartName\" (onConfirm)='handleOnConfirm($event)'></confirm>\n      \n       <pie-chart-demo [hidden]=\"chartArray[19][2]\" id=\"pc19\" [data]=\"data[19]\"></pie-chart-demo>\n\n\n</div>\n\n<div  *ngIf=\"count>=20\" droppable (drop)=\"onDrop($event)\" id=\"dropAreaText20\" (dblclick)=\"alter(20)\" [class]=\"classAlter[20]? 'full': 'half'\" >\n\n      <p [hidden]=\"!chartArray[20][0] || !chartArray[20][1] || !chartArray[20][2]\"  >drop chart here</p>\n\n<confirm [hidden]=\"chartArray[20][0]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[20][0]\" id=\"pc20\" [data]=\"data[20]\"></pie-chart-demo>\n\n\n<confirm [hidden]=\"chartArray[20][1]\" [chartName]=\"chartName\" (onDrawPlan)=\"getPlanName($event)\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n      <bar-chart-demo [hidden]=\"chartArray[20][1]\" [planName]=\"planNam\" id=\"pc20\" [data]=\"data[20]\" ></bar-chart-demo>\n\n<confirm [hidden]=\"chartArray[20][2]\" [chartName]=\"chartName\"  (onConfirm)='handleOnConfirm($event)'></confirm>\n    \n       <pie-chart-demo [hidden]=\"chartArray[20][2]\" id=\"pc20\" [data]=\"data[20]\"></pie-chart-demo>\n\n</div>\n</div>\n\n\n\n\n<div id=\"sub\"  class=\"sub\">\n    <drag-drop-demo (chartOutput)=\"getchartName($event)\" (updatedCount)=\"getcount($event)\"></drag-drop-demo>\n</div>\n\n\n\n <!--\n<td>\n  <div>\n      // pop up\n  <confirm [hidden]=\"showChart\" (onConfirm)='handleOnConfirm($event)'></confirm>\n  \n   </div>\n</td>\n\n <td width=\"60%\">\n\n<div>\n//   pie chart \n    <pie-chart-demo [hidden]=\"showChart\" id=\"pc\" [data]=\"data\"></pie-chart-demo>\n\n</div>\n\n </td>\n\n\n\n\n\n <td style=\"width:40%\">\n  <div>\n      // drag drop and tools box\n  <drag-drop-demo (showPieChart)=\"showPieChart($event)\"></drag-drop-demo>\n  \n \n  </div>\n\n  </td>\n\n\n\n-->\n\n\n\n\n\n\n\n\n\n\n"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__fetch_service__ = __webpack_require__("../../../../../src/app/fetch.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ng2_bootstrap_modal__ = __webpack_require__("../../../../ng2-bootstrap-modal/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ng2_bootstrap_modal___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_ng2_bootstrap_modal__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__confirm_component__ = __webpack_require__("../../../../../src/app/confirm.component.ts");
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AppComponent = (function () {
    //@Output() showPiethisChart = new EventEmitter();
    function AppComponent(dialogService) {
        this.dialogService = dialogService;
        this.title = 'app';
        this.data = [];
        this.count = 0;
        //htmlStr="<div droppable (drop)=\"onDrop1($event)\" id=\"dropAreaText1\" class=\"half\" >  <confirm [hidden]=\"showChart1\" (onConfirm)='handleOnConfirm1($event)'></confirm>  <p id=\"dropText1\" >drop chart here </p> <pie-chart-demo [hidden]=\"showChart1\" id=\"pc1\" [data]=\"data1\"></pie-chart-demo>  </div>";
        this.showPopup = false;
        this.chartArray = [[true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true], [true, true, true]];
        this.classAlter = [true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true];
    }
    AppComponent.prototype.showConfirm = function () {
        var disposable = this.dialogService.addDialog(__WEBPACK_IMPORTED_MODULE_3__confirm_component__["a" /* ConfirmComponent */], {
            title: 'Confirm title',
            message: 'Confirm message'
        })
            .subscribe(function (isConfirmed) {
            if (isConfirmed) {
                // alert('accepted');
            }
            else {
                // alert('declined');
            }
        });
    };
    AppComponent.prototype.handleOnConfirm = function (data) {
        console.log('app compomnent handleOnConfirm', data);
        this.data[this.globalIndex] = data;
    };
    AppComponent.prototype.getcount = function (con) {
        console.log('handleOnConfirm', con);
        this.count = con;
    };
    AppComponent.prototype.getchartName = function (name) {
        this.chartName = name;
        // alert(this.chartName);
    };
    AppComponent.prototype.getPlanName = function (planNam) {
        console.log('shashank', planNam);
        this.planNam = planNam;
    };
    AppComponent.prototype.alter = function (id) {
        if (this.classAlter[id] == true) {
            this.classAlter[id] = false;
        }
        else {
            this.classAlter[id] = true;
        }
    };
    AppComponent.prototype.onDrop = function (event) {
        event.preventDefault();
        event.stopPropagation();
        //var target = event.target || event.srcElement || event.currentTarget;
        var target = event.currentTarget;
        var idAttr = target.attributes.id;
        var value = idAttr.nodeValue;
        value = value.slice(-1);
        this.globalIndex = value;
        this.chartArray[value][0] = true;
        this.chartArray[value][1] = true;
        this.chartArray[value][2] = true;
        if (this.chartName == 'PieChart') {
            this.chartArray[value][0] = false;
        }
        if (this.chartName == 'BarChrat') {
            this.chartArray[value][1] = false;
        }
        if (this.chartName == 'webtable') {
            this.chartArray[value][2] = false;
        }
        console.log("on drop event fired");
        console.log(event);
    };
    AppComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'app-root',
            template: __webpack_require__("../../../../../src/app/app.component.html"),
            styles: [__webpack_require__("../../../../../src/app/app.component.css")],
            providers: [__WEBPACK_IMPORTED_MODULE_1__fetch_service__["a" /* TableService */]]
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2_ng2_bootstrap_modal__["DialogService"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2_ng2_bootstrap_modal__["DialogService"]) === "function" && _a || Object])
    ], AppComponent);
    return AppComponent;
    var _a;
}());

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__("../../../platform-browser/@angular/platform-browser.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_ng2_charts_ng2_charts__ = __webpack_require__("../../../../ng2-charts/ng2-charts.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_ng2_charts_ng2_charts___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_ng2_charts_ng2_charts__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__piechartdemo_component__ = __webpack_require__("../../../../../src/app/piechartdemo.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__barchart_component__ = __webpack_require__("../../../../../src/app/barchart.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__demo_component__ = __webpack_require__("../../../../../src/app/demo.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_ng2_drag_drop__ = __webpack_require__("../../../../ng2-drag-drop/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8_ng2_drag_drop___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_8_ng2_drag_drop__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__angular_platform_browser_animations__ = __webpack_require__("../../../platform-browser/bundles/platform-browser-animations.umd.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__angular_platform_browser_animations___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_9__angular_platform_browser_animations__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__angular_forms__ = __webpack_require__("../../../forms/@angular/forms.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11_angular2_busy__ = __webpack_require__("../../../../angular2-busy/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11_angular2_busy___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_11_angular2_busy__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12_ng2_bootstrap_modal__ = __webpack_require__("../../../../ng2-bootstrap-modal/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12_ng2_bootstrap_modal___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_12_ng2_bootstrap_modal__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__confirm_component__ = __webpack_require__("../../../../../src/app/confirm.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__fetch_service__ = __webpack_require__("../../../../../src/app/fetch.service.ts");
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};















var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["NgModule"])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */], __WEBPACK_IMPORTED_MODULE_4__piechartdemo_component__["a" /* PieChartDemoComponent */], __WEBPACK_IMPORTED_MODULE_5__barchart_component__["a" /* BarChartDemoComponent */], __WEBPACK_IMPORTED_MODULE_7__demo_component__["a" /* DemoComponent */], __WEBPACK_IMPORTED_MODULE_13__confirm_component__["a" /* ConfirmComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["BrowserModule"],
                __WEBPACK_IMPORTED_MODULE_3_ng2_charts_ng2_charts__["ChartsModule"],
                __WEBPACK_IMPORTED_MODULE_6__angular_http__["a" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_10__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_8_ng2_drag_drop__["Ng2DragDropModule"].forRoot(),
                __WEBPACK_IMPORTED_MODULE_12_ng2_bootstrap_modal__["BootstrapModalModule"],
                __WEBPACK_IMPORTED_MODULE_9__angular_platform_browser_animations__["BrowserAnimationsModule"],
                __WEBPACK_IMPORTED_MODULE_11_angular2_busy__["BusyModule"] //,
                // PopupModule.forRoot()
            ],
            //  entryComponents: [
            //       ConfirmComponent
            //     ],
            providers: [__WEBPACK_IMPORTED_MODULE_14__fetch_service__["a" /* TableService */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ "../../../../../src/app/barchart.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__fetch_service__ = __webpack_require__("../../../../../src/app/fetch.service.ts");
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BarChartDemoComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var BarChartDemoComponent = (function () {
    function BarChartDemoComponent(_tableService) {
        this._tableService = _tableService;
        this.data = [];
        this.hidden = true;
        this.planName = "";
        this.barChartLabels = [];
        this.barChartType = 'bar';
        this.barChartLegend = true;
        this.subscriptions = [];
        this.bar = [];
        // public barChartOptions:any = {
        //  scaleShowVerticalLines: false,
        // responsive: true
        // };    style="display: block"
        this.barChartOptions = {
            animation: {
                duration: 0,
                onComplete: function () {
                    // render the value of the chart above the bar
                    var ctx = this.chart.ctx;
                    var Chart = this;
                    // ctx.font = Chart.helpers.fontString(Chart.defaults.global.defaultFontSize, 'normal', Chart.defaults.global.defaultFontFamily);
                    ctx.font = "10px Arial";
                    ctx.fillStyle = "Black";
                    ctx.textAlign = 'center';
                    ctx.textBaseline = 'bottom';
                    this.data.datasets.forEach(function (dataset) {
                        for (var i = 0; i < dataset.data.length; i++) {
                            var model = dataset._meta[Object.keys(dataset._meta)[0]].data[i]._model;
                            if (dataset.data[i] == 0) {
                                // alert(dataset.data[i]);
                            }
                            else {
                                ctx.fillText(dataset.data[i], model.x - 14, model.y + 7);
                            }
                        }
                    });
                }
            },
            scales: {
                xAxes: [{
                        stacked: true
                    }],
                yAxes: [{
                        stacked: true
                    }]
            }
        };
        this.barChartData = [];
        this.options = {
            scales: {
                xAxes: [{
                        stacked: true
                    }],
                yAxes: [{
                        stacked: true
                    }]
            }
        };
        this.distinctvalue = [];
        this.barChartcolors = [
            {}
        ];
        console.log("pie chart component constructor");
    }
    BarChartDemoComponent.prototype.ngOnInit = function () {
        console.log("ngOnInit " + this._tableService.getChartData());
        this.initListeners();
    };
    BarChartDemoComponent.prototype.ngOnChanges = function () {
        if (this.data != null) {
            // your code here.
            if (this.data.length > 0) {
                this.handleOnConfirm();
            }
        }
    };
    BarChartDemoComponent.prototype.initListeners = function () {
        this.subscriptions.push(this._tableService
            .pieChartListener()
            .subscribe(function () {
            console.log("pie chart manipulation");
        }));
    };
    BarChartDemoComponent.prototype.handleOnConfirm = function () {
        var _this = this;
        console.log('handleOnConfirm', this.data);
        console.log('shashANK', this.planName);
        this._tableService.getdistinctvalue(this.planName)
            .subscribe(function (restableData) {
            // this.processResponse(restableData);
            _this.distinctvalue = restableData;
            console.log('(restableData', restableData);
            var i = 0;
            _this.distinctvalue.forEach(function (stackLabels) {
                _this.barChartData.push({
                    data: [],
                    label: stackLabels.status,
                    backgroundColor: stackLabels.color
                });
            });
            var component = "first";
            _this.data.forEach(function (value) {
                if (component == "first") {
                    _this.barChartLabels.push(value.component);
                }
                else {
                    if (component == value.component) {
                    }
                    else {
                        _this.barChartLabels.push(value.component);
                    }
                }
                component = value.component;
            });
            var component = "first";
            var j = 0;
            var totalComponents = _this.barChartLabels.length;
            _this.data.forEach(function (value) {
                var i = 0;
                if (component != value.component && component != "first") {
                    j++;
                    var z = 0;
                    _this.barChartData.forEach(function (stackLabels) {
                        var indexLength = _this.barChartData[z].data.length;
                        if (indexLength < j)
                            _this.barChartData[z].data.push(0);
                        z++;
                    });
                }
                _this.barChartData.forEach(function (stackLabels) {
                    if (value.status == stackLabels.label) {
                        _this.barChartData[i].data.push(value.count);
                        //    var indexLength =  this.barChartData[i].data.length;
                        //if(indexLength<j )
                        // this.barChartData[i].data.push(0);
                    }
                    else if (value.status != stackLabels.label && component != value.component && component != "first") {
                    }
                    i++;
                    console.log(value.count);
                });
                component = value.component;
            });
            var n = 0;
            _this.barChartData.forEach(function (stackLabels) {
                var indexLength = _this.barChartData[n].data.length;
                if (indexLength < totalComponents)
                    _this.barChartData[n].data.push(0);
                n++;
            });
            console.log("pie chart data", _this.barChartData);
            console.log("pie chart data", _this.barChartLabels);
        });
    };
    BarChartDemoComponent.prototype.processResponse = function (data) {
        var _this = this;
        alert("hi processResponse");
        console.log("Inside process");
        this.distinctvalue = data;
        var i = 0;
        this.distinctvalue.forEach(function (stackLabels) {
            if (i == 0) {
                _this.barChartData[0].label = stackLabels.status;
            }
            else {
                //this.barChartData.push(new barcomponent());
                _this.barChartData[i].label = stackLabels.status;
            }
            i++;
            console.log(stackLabels.status);
        });
        //  this.distinctvalue.forEach((stackLabels) => {
        //  var i=0;
        //  this.barChartData[i] = new barcomponent();
        //  this.barChartData[i].label=stackLabels.status;
        //  i++;
        // console.log(stackLabels.status);
        //});
    };
    BarChartDemoComponent.prototype.chartClicked = function (e) {
        console.log(e);
    };
    BarChartDemoComponent.prototype.chartHovered = function (e) {
        console.log(e);
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], BarChartDemoComponent.prototype, "data", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], BarChartDemoComponent.prototype, "hidden", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], BarChartDemoComponent.prototype, "planName", void 0);
    BarChartDemoComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'bar-chart-demo',
            template: "\n\n\n  <div [hidden]=\"hidden\" *ngIf='!!barChartData.length' style=\"position:relative;justify-content:center;\"> \n  \n    <canvas baseChart\n            [datasets]=\"barChartData\"\n            [labels]=\"barChartLabels\"\n            [options]=\"barChartOptions\"\n            [legend]=\"barChartLegend\"\n            chartType=\"horizontalBar\"\n            [colors]=\"barChartcolors\"\n            (chartHover)=\"chartHovered($event)\"\n            (chartClick)=\"chartClicked($event)\"></canvas>\n\n</div>"
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__fetch_service__["a" /* TableService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__fetch_service__["a" /* TableService */]) === "function" && _a || Object])
    ], BarChartDemoComponent);
    return BarChartDemoComponent;
    var _a;
}());

//# sourceMappingURL=barchart.component.js.map

/***/ }),

/***/ "../../../../../src/app/confirm.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__ = __webpack_require__("../../../../ng2-bootstrap-modal/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__fetch_service__ = __webpack_require__("../../../../../src/app/fetch.service.ts");
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ConfirmComponent; });
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ConfirmComponent = (function (_super) {
    __extends(ConfirmComponent, _super);
    function ConfirmComponent(dialogService, _tableService) {
        var _this = _super.call(this, dialogService) || this;
        _this._tableService = _tableService;
        _this.hidden = true;
        _this.tableData = [];
        _this.category = [];
        _this.readableNames = [];
        _this.chartData = [];
        _this.onConfirm = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["EventEmitter"]();
        _this.onDrawPlan = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["EventEmitter"]();
        _this.EntityValue = 1;
        return _this;
    }
    ConfirmComponent.prototype.ngOnInit = function () {
        var _this = this;
        console.log('Confirm component ngonit');
        this.busy1 = this._tableService.getTables()
            .subscribe(function (restableData) { return _this.tableData = restableData; });
        this.busy2 = this._tableService.getCategory(this.EntityValue)
            .subscribe(function (restableData) { return _this.category = restableData; });
    };
    ConfirmComponent.prototype.ngOnChanges = function () {
        // alert(this.hidden);
    };
    ConfirmComponent.prototype.getReadableNames = function () {
        var _this = this;
        this.busy3 = this._tableService.getReadableNames(this.PlanNameValue)
            .subscribe(function (restableData) { return _this.readableNames = restableData; });
    };
    ConfirmComponent.prototype.saverange = function () {
        var _this = this;
        this.busy3 = this._tableService.getCategory(this.EntityValue)
            .subscribe(function (restableData) { return _this.category = restableData; });
    };
    ConfirmComponent.prototype.drawChart = function () {
        var _this = this;
        console.log(this.PlanNameValue);
        console.log(this.CategoryValue);
        console.log("confirm component-draw chart ");
        this.busy4 = this._tableService.drawChart(this.PlanNameValue, this.EntityValue, this.CategoryValue, this.chartName)
            .subscribe(function (restableData) {
            _this.onDrawPlan.emit(_this.PlanNameValue);
            _this.onConfirm.emit(restableData);
        });
        this.hidden = true;
    };
    ConfirmComponent.prototype.closePopup = function () {
        console.log("close popup");
        this.hidden = true;
        //  alert(this.hidden);
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], ConfirmComponent.prototype, "hidden", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], ConfirmComponent.prototype, "chartName", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Output"])(),
        __metadata("design:type", Object)
    ], ConfirmComponent.prototype, "onConfirm", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Output"])(),
        __metadata("design:type", Object)
    ], ConfirmComponent.prototype, "onDrawPlan", void 0);
    ConfirmComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'confirm',
            template: "<div [ngBusy]=\"busy\">\n    <head>\n<style>\n\n\n/* Style the label */\n\nlabel {\n    color: #6a98e2;\n    font-size:15px;\n}\n\nbutton\n{\n    color: #6a98e2;\n    font-size:15px;\n}\n\n\n</style>\n</head>\n     \n    \n    \n    <div [hidden]=\"hidden\" class=\"modal-dialog\" style=\"position: absolute; top: 14%;margin-left:150px\">\n      \n      <div class=\"modal-content\">\n        \n                  <div class=\"modal-header\" style=\"color:#f7f8f9;background-color:#6a98e2;\">\n                     <button type=\"button\" class=\"close\" (click)=\"closePopup()\" >&times;</button>\n                     <h4 class=\"modal-title\"> {{chartName}} - Report Settings</h4>\n                   </div>\n\n  <div class=\"modal-body\" [ngSwitch]=\"chartName\"  [ngBusy]=\"busy1\">\n  <div *ngSwitchCase=\"'PieChart'\"   >            \n  <label>Project Name</label>&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"PlanNameValue\" style=\"width:300px;\">\n  <option *ngFor=\"let restableDataind of tableData\"  ngDefaultControl value= {{restableDataind.planName}}>\n  {{restableDataind.planName}}\n  </option>\n  </select>\n  </div>\n\n  <div  *ngSwitchCase=\"'BarChrat'\"    >        \n  <label>Project Name</label>&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"PlanNameValue\" (change)=\"getReadableNames()\" style=\"width:300px;\">\n  <option *ngFor=\"let restableDataind of tableData\"  ngDefaultControl value= {{restableDataind.planName}}>\n  {{restableDataind.planName}}\n  </option>\n  </select>\n  </div>\n\n  <div   *ngSwitchCase=\"'webtable'\"   >          \n  <label>Project Name</label>&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"PlanNameValue\" style=\"width:300px;\">\n  <option *ngFor=\"let restableDataind of tableData\"  ngDefaultControl value= {{restableDataind.planName}}>\n  {{restableDataind.planName}}\n  </option>\n  </select>\n  </div>\n\n</div>\n    <div class=\"modal-body\" [ngSwitch]=\"chartName\"  [ngBusy]=\"busy2\">\n\n    <div *ngSwitchCase=\"'PieChart'\">\n           <label>Entity </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n          <select  name=\"Entity\" style=\"width:300px;\" [(ngModel)]=\"EntityValue\" ngDefaultControl (change)=\"saverange()\" >\n            <option  [value]=\"1\" [selected]=\"tableData.Entity ==1\">Defects</option>\n            <option  [value]=\"0\" [selected]=\"tableData.Entity ==0\">Test Execution</option>\n          </select>\n    </div>\n\n     <div *ngSwitchCase=\"'BarChrat'\">  \n           <label>Entity </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n          <select  name=\"Entity\" style=\"width:300px;\" [(ngModel)]=\"EntityValue\" ngDefaultControl (change)=\"getReadableNames()\" >\n          <!--  <option  [value]=\"0\" [selected]=\"tableData.Entity ==0\"></option> -->\n            <option  [value]=\"1\" [selected]=\"tableData.Entity ==1\">Test Execution</option>\n          </select>\n    </div>\n\n\n     <div *ngSwitchCase=\"'webtable'\">\n           <label>Entity </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n          <select  name=\"Entity\" style=\"width:300px;\" [(ngModel)]=\"EntityValue\" ngDefaultControl (change)=\"saverange()\" >\n            <option  [value]=\"1\" [selected]=\"tableData.Entity ==1\">Status</option>\n            <option  [value]=\"0\" [selected]=\"tableData.Entity ==0\">Test Execution</option>\n          </select>\n    </div>\n\n    </div>\n\n\n        <div [ngBusy]=\"busy3\"  [ngSwitch]=\"chartName\"   class=\"modal-body\" >\n          <div *ngSwitchCase=\"'PieChart'\">\n   <label>Category </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"CategoryValue\" style=\"width:300px;\">\n <option *ngFor=\"let restableDatain of category\"  ngDefaultControl value= {{restableDatain.category}}>\n    {{restableDatain.category}} \n  </option> \n \n</select>\n  </div>\n\n\n  <div *ngSwitchCase=\"'BarChrat'\">\n\n   <label>Category </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"CategoryValue\" style=\"width:300px;\">\n <option *ngFor=\"let restableDatain of readableNames\"  ngDefaultControl value= {{restableDatain.readableName}}>\n    {{restableDatain.readableName}} \n  </option> \n\n   <option  [value]=\"0\" [selected]=\"tableData.Entity ==0\">Test Type</option>\n  </select>\n  </div>\n\n\n  <div *ngSwitchCase=\"'webtable'\">\n\n   <label>Category </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n  <select [(ngModel)]=\"CategoryValue\" style=\"width:300px;\">\n <option *ngFor=\"let restableDatain of category\"  ngDefaultControl value= {{restableDatain.category}}>\n    {{restableDatain.category}} \n  </option> \n</select>\n  </div>\n\n\n  </div>\n\n  <div [ngBusy]=\"busy4\"  class=\"modal-footer\"   style=\"color:#f7f8f9;background-color:#6a98e2;\"   >\n  <button (click)=\"drawChart()\">Draw Chart</button>\n  </div>\n  </div>\n              </div></div>",
            providers: [__WEBPACK_IMPORTED_MODULE_2__fetch_service__["a" /* TableService */]]
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__["DialogService"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__["DialogService"]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__fetch_service__["a" /* TableService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__fetch_service__["a" /* TableService */]) === "function" && _b || Object])
    ], ConfirmComponent);
    return ConfirmComponent;
    var _a, _b;
}(__WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__["DialogComponent"]));

//# sourceMappingURL=confirm.component.js.map

/***/ }),

/***/ "../../../../../src/app/demo.component.html":
/***/ (function(module, exports) {

module.exports = " <head>\r\n<style>\r\nbody {font-family: \"Lato\", sans-serif;}\r\n\r\n/* Style the shashank */\r\ndiv.shashank {\r\n      border-style: solid;\r\n       width:22%;\r\n       height: 550px;\r\n}\r\n\r\n\r\n\r\n/* Style the tab */\r\ndiv.tab {\r\n    overflow: hidden;\r\n    border: 1px solid #ccc;\r\n /* background-color: #f1f1f1; #6a98e2  #010511 */   \r\n    background-color: #6a98e2;\r\n    color: white;\r\n    width:100%;\r\n    font-size: 15px;\r\n}\r\n\r\n/* Style the buttons inside the tab */\r\ndiv.tab button {\r\n    background-color: inherit;\r\n    float: left;\r\n    border: none;\r\n    outline: none;\r\n    cursor: pointer;\r\n    padding: 19px 60px;\r\n    transition: 0.3s;\r\n     font-size: 11px;\r\n   \r\n}\r\n\r\n/* Change background color of buttons on hover */\r\ndiv.tab button:hover {\r\n    background-color: #2d2f30;\r\n}\r\n\r\n/* Create an active/current tablink class */\r\ndiv.tab button.active {\r\n    background-color: #ccc;\r\n}\r\n\r\n/* Style the tab content */\r\n.tabcontent {\r\n    display: none;\r\n    padding: 80px 220px;\r\n    border: 1px solid #ccc;\r\n    border-top: none;   \r\n}\r\n  td { \r\n    padding: 50px;\r\n}\r\n div.half { width: 50%; height: 50%; float: left; background: white; border:0.1px solid #d7dfe8; } \r\ndiv.first { width: 100%; height: 75%; float: left;  background: white; }\r\ndiv.second { width: 100%; height: 25%; float: left;  background: white;  }\r\n</style>\r\n</head>\r\n\r\n  \r\n<div class=\"first\">\r\n\r\n\r\n\r\n<fieldset>\r\n  <div class=\"toolbar\" style=\"width:100%\">\r\n\r\n     <div  class=\"tab\" style=\"width:100%\">\r\n    <h3>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tools </h3> \r\n      </div>\r\n \r\n<div  class=\"tab\" style=\"width:100%\" >\r\n  <button  (click)=\"setTab('Advanced') \">Advanced &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>\r\n  <button  (click)=\"setTab('Basic') \">Basic &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>\r\n</div>\r\n<div id=\"Basic1\"   *ngIf=\"AdvancedFlag\" >\r\n  <ul style=\"list-style-type:none\">\r\n  \r\n\r\n  <li > &nbsp;  </li>\r\n\r\n  <li   ><img draggable  src=\"PieChart.png\"   (dragstart)= \"onDra($event,'PieChart')\"  style=\"width:50px;height:65px;\"  alt=\"\" > &nbsp;   Pie Chart</li>\r\n \r\n<li > &nbsp;  </li>\r\n <li > <img draggable src=\"BarChrat.png\"    (dragstart)= \"onDra($event,'BarChrat')\"  style=\"width:50px;height:65px;\"  alt=\"\">  &nbsp;  Bar Chart</li> \r\n <li > &nbsp;  </li>\r\n <li   ><img  draggable src=\"webtable.png\"  (dragstart)= \"onDra($event,'webtable')\" style=\"width:50px;height:65px;\"  alt=\"\">  &nbsp;  Web table</li> \r\n <li > &nbsp;  </li>  </ul> \r\n<img   src=\"blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n\r\n\r\n</div>\r\n\r\n\r\n<div id=\"Advanced1\" *ngIf=\"BasicFlag\"  >\r\n<ul>\r\n  <img   src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n<img  src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n<img  src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\"></ul> \r\n</div>\r\n\r\n\r\n</div>\r\n</fieldset>\r\n</div>\r\n\r\n\r\n\r\n\r\n<div class=\"second\">\r\n\r\n<ul>\r\n<img  src=\"Add.png\"    style=\"width:45px;height:55px;\"   (click)=\"add()\"  alt=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n<!--   <img  src=\"remove.png\"    style=\"width:48px;height:60px;\"   (click)=\"remove()\"  alt=\"\">-->\r\n</ul>  \r\n\r\n\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n  <!--\r\n<table  style=\"width:100%\">\r\n\r\n\r\n\r\n<tr> \r\n\r\n<td    style=\"width:20%\">\r\n<div droppable (drop)=\"onDrop($event)\">\r\n  <div  id=\"dropAreaText\">\r\n  <p>drop chart here </p>\r\n\r\n  \r\n  </div>\r\n  \r\n</div>\r\n</td>\r\n\r\n\r\n<img  src=\"Add.png\"    style=\"width:50px;height:65px;\"   (click)=\"add()\"  alt=\"\">\r\n<img  src=\"remove.png\"    style=\"width:50px;height:65px;\"   (click)=\"remove()\"  alt=\"\">\r\n\r\n\r\n\r\n<td style=\"width:80%\">\r\n<fieldset>\r\n  <div class=\"toolbar\" style=\"width:100%\">\r\n\r\n     <div  class=\"tab\" style=\"width:100%\">\r\n      Tools\r\n      </div>\r\n \r\n<div  class=\"tab\" style=\"width:100%\" >\r\n  <button  (click)=\"setTab('Advanced') \">Advanced &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>\r\n  <button  (click)=\"setTab('Basic') \">Basic &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>\r\n</div>\r\n<div id=\"Basic1\"   *ngIf=\"AdvancedFlag\" >\r\n  <ul style=\"list-style-type:none\">\r\n  \r\n\r\n  <li > &nbsp;  </li>\r\n\r\n  <li draggable><img   src=\"PieChart.png\"    style=\"width:50px;height:65px;\"  alt=\"\"> &nbsp;   Pie Chart</li>\r\n \r\n<li > &nbsp;  </li>\r\n <li draggable> <img draggable src=\"BarChrat.png\"    style=\"width:50px;height:65px;\"  alt=\"\">  &nbsp;  Bar Chart</li> \r\n <li > &nbsp;  </li>\r\n <li draggable><img draggable src=\"webtable.png\"    style=\"width:50px;height:65px;\"  alt=\"\">  &nbsp;  Web table</li> \r\n <li > &nbsp;  </li>  </ul> \r\n<img   src=\"blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n\r\n\r\n</div>\r\n\r\n\r\n<div id=\"Advanced1\" *ngIf=\"BasicFlag\"  >\r\n<ul>\r\n  <img   src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n<img  src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\">\r\n<img  src=\"assets/img/blank.png\"    style=\"width:150px;height:128px;\"  alt=\"\"></ul> \r\n</div>\r\n\r\n\r\n</div>\r\n</fieldset>\r\n</td>\r\n\r\n\r\n\r\n</tr>\r\n\r\n\r\n</table>\r\n\r\n-->"

/***/ }),

/***/ "../../../../../src/app/demo.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__ = __webpack_require__("../../../../ng2-bootstrap-modal/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DemoComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var DemoComponent = (function () {
    function DemoComponent(dialogService) {
        this.dialogService = dialogService;
        this.AdvancedFlag = true;
        this.BasicFlag = false;
        this.count = 0;
        //private showPopup=false;
        this.updatedCount = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["EventEmitter"]();
        this.chartOutput = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["EventEmitter"]();
    }
    // showConfirm() {
    //          let disposable = this.dialogService.addDialog(ConfirmComponent, {
    //             title:'Confirm title', 
    //             message:'Confirm message'})
    //             .subscribe((isConfirmed)=>{        
    //                 if(isConfirmed) {
    // alert('accepted');
    //             }
    //            else {
    //                // alert('declined');
    ///          }
    ///       });
    //  }
    DemoComponent.prototype.add = function () {
        this.count = this.count + 1;
        this.updatedCount.emit(this.count);
        // document.getElementById("main").innerHTML =document.getElementById("main").innerHTML
        //    +" "+     "<div droppable (drop)=\"onDrop5($event)\" id=\"dropAreaText5\" class=\"half\" >  <confirm [hidden]=\"showChart5\" (onConfirm)='handleOnConfirm5($event)'></confirm>  <p id=\"dropText5\" >drop chart here </p> <pie-chart-demo [hidden]=\"showChart5\" id=\"pc5\" [data]=\"data5\"></pie-chart-demo>  </div>";
    };
    DemoComponent.prototype.remove = function () {
        alert("remove");
    };
    DemoComponent.prototype.onDra = function (event, name) {
        this.chartName = name;
        this.chartOutput.emit(this.chartName);
    };
    //onDrop(event:any) {
    //event.preventDefault();
    //event.stopPropagation();
    //console.log("on drop event fired");
    //document.getElementById("dropAreaText").hidden=true;
    //document.getElementById("pc").hidden=false;
    //this.showPopup=true;
    //console.log(event);
    //this.showPieChart.emit(false);
    //}
    DemoComponent.prototype.setTab = function (param) {
        if (param == 'Advanced') {
            this.AdvancedFlag = true;
            this.BasicFlag = false;
        }
        else if (param == 'Basic') {
            this.BasicFlag = true;
            this.AdvancedFlag = false;
        }
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Output"])(),
        __metadata("design:type", Object)
    ], DemoComponent.prototype, "updatedCount", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Output"])(),
        __metadata("design:type", Object)
    ], DemoComponent.prototype, "chartOutput", void 0);
    DemoComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'drag-drop-demo',
            template: __webpack_require__("../../../../../src/app/demo.component.html")
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__["DialogService"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ng2_bootstrap_modal__["DialogService"]) === "function" && _a || Object])
    ], DemoComponent);
    return DemoComponent;
    var _a;
}());

//# sourceMappingURL=demo.component.js.map

/***/ }),

/***/ "../../../../../src/app/fetch.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_Subject__ = __webpack_require__("../../../../rxjs/Subject.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_Subject___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_Subject__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TableService; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var TableService = (function () {
    function TableService(_http) {
        this._http = _http;
        this._url = "http://10.118.5.248:8081/TWB/ords/preprod/listtestplan/";
        // private _url: string ="http://localhost:8080/TWB/ords/preprod/listtestplan/"
        this._url2 = "http://10.118.5.248:8081/TWB/ords/preprod/getEntityNames";
        this._url3 = "http://10.118.5.248:8081/TWB/ords/preprod/drawChart";
        //  private _url3: string ="http://localhost:8080/TWB/ords/preprod/drawChart"
        // private getReadableNamesForCategory: string ="http://localhost:8080/TWB/ords/preprod/getReadableNamesForCategory"
        this.getReadableNamesForCategory = "http://10.118.5.248:8081/TWB/ords/preprod/getReadableNamesForCategory";
        //  private distinctvalue: string ="http://localhost:8080/TWB/ords/preprod/distinctStatus"
        this.distinctvalue = "http://10.118.5.248:8081/TWB/ords/preprod/distinctStatus";
        this.subject = new __WEBPACK_IMPORTED_MODULE_3_rxjs_Subject__["Subject"]();
    }
    TableService.prototype.getTables = function () {
        var header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]();
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]();
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin', '*');
        header.append('Access-Control-Allow-Headers', 'Content-Type');
        header.append('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
        return this._http.get(this._url, options)
            .map(function (response) { return response.json(); });
    };
    TableService.prototype.getCategory = function (param) {
        var _url3 = this._url2 + "?" + "entity=" + param;
        var header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]();
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]();
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin', '*');
        header.append('Access-Control-Allow-Headers', 'Content-Type');
        header.append('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
        return this._http.get(_url3, options)
            .map(function (response) { return response.json(); });
    };
    TableService.prototype.drawChart = function (planName, entity, category, chartName) {
        this.planName = planName;
        var _url4 = this._url3 + "?" + "planName=" + planName + "&entity=" + entity + "&category=" + category + "&chartType=" + chartName;
        console.log("fetch service->" + _url4);
        var header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]();
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]();
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin', '*');
        header.append('Access-Control-Allow-Headers', 'Content-Type');
        header.append('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
        console.log("draw chart action " + _url4);
        return this._http.get(_url4, options)
            .map(function (response) { return response.json(); })
            .do(function (res) {
            console.log(res);
        });
    };
    TableService.prototype.getReadableNames = function (planName) {
        var _url4 = this.getReadableNamesForCategory + "?" + "planName=" + planName;
        console.log("fetch service->" + _url4);
        var header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]();
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]();
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin', '*');
        header.append('Access-Control-Allow-Headers', 'Content-Type');
        header.append('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
        console.log("draw chart action " + _url4);
        return this._http.get(_url4, options)
            .map(function (response) { return response.json(); })
            .do(function (res) {
            console.log(res);
        });
    };
    TableService.prototype.getdistinctvalue = function (planName) {
        this.planName = planName;
        var _url4 = this.distinctvalue + "?" + "planName=" + planName;
        console.log("fetch service->" + _url4);
        var header = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Headers */]();
        var options = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["c" /* RequestOptions */]();
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin', '*');
        header.append('Access-Control-Allow-Headers', 'Content-Type');
        header.append('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS');
        console.log("draw chart action " + _url4);
        return this._http.get(_url4, options)
            .map(function (response) { return response.json(); })
            .do(function (res) {
            console.log(res);
        });
    };
    TableService.prototype.setChartData = function (chartData) {
        console.log("fetch service setchartdata" + chartData);
        this._chartData = chartData;
        this.subject.next(true);
    };
    TableService.prototype.pieChartListener = function () {
        console.log("fetch service-->pieChartListener");
        return this.subject.asObservable();
    };
    TableService.prototype.getChartData = function () {
        console.log("fetch service getchartdata" + this._chartData);
        return this._chartData;
    };
    TableService = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */]) === "function" && _a || Object])
    ], TableService);
    return TableService;
    var _a;
}());

//# sourceMappingURL=fetch.service.js.map

/***/ }),

/***/ "../../../../../src/app/piechart.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PieChartServiceData; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var PieChartServiceData = (function () {
    function PieChartServiceData(_http) {
        this._http = _http;
    }
    PieChartServiceData.prototype.getCurrentTime = function () {
        return this._http.get('http://localhost:8080/TWB/ords/preprod/count/')
            .map(function (res) { return res.json(); });
    };
    PieChartServiceData.prototype.postJSON = function () {
    };
    PieChartServiceData = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Injectable"])(),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["d" /* Http */]) === "function" && _a || Object])
    ], PieChartServiceData);
    return PieChartServiceData;
    var _a;
}());

//# sourceMappingURL=piechart.service.js.map

/***/ }),

/***/ "../../../../../src/app/piechartdemo.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__piechart_service__ = __webpack_require__("../../../../../src/app/piechart.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__fetch_service__ = __webpack_require__("../../../../../src/app/fetch.service.ts");
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PieChartDemoComponent; });
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var PieChartDemoComponent = (function () {
    function PieChartDemoComponent(_httpService, _tableService) {
        this._httpService = _httpService;
        this._tableService = _tableService;
        this.subscriptions = [];
        this.pieChartLabels = [];
        this.pieChartData = [];
        this.pieChartcolors = [
            {
                backgroundColor: []
                //  backgroundColor:["#ef4d47", "#ecef34", "#3df75c", "#467bf4", " #00ffff"] 
                //  backgroundColor:["#ef4d47", "#ecef34"] 
            }
        ];
        //  public pieChartcolors:any[] = [];
        this.pieChartType = 'pie';
        this.pieChartOptions = {
            responsive: true,
            tooltips: {
                enabled: true
            },
            animation: {
                onComplete: function () {
                    var ctx = this.chart.ctx;
                    ctx.textAlign = "center";
                    ctx.textBaseline = "bottom";
                    var chart = this;
                    var datasets = this.config.data.datasets;
                    datasets.forEach(function (dataset, i) {
                        ctx.font = "13px Arial";
                        ctx.fillStyle = "Black";
                        chart.getDatasetMeta(i).data.forEach(function (p, j) {
                            var mid_radius = p._model.innerRadius + (p._model.outerRadius - p._model.innerRadius) / 2;
                            var start_angle = p._model.startAngle;
                            var end_angle = p._model.endAngle;
                            var mid_angle = start_angle + (end_angle - start_angle) / 2;
                            var x = mid_radius * Math.cos(mid_angle);
                            var y = mid_radius * Math.sin(mid_angle);
                            ctx.fillText(datasets[i].data[j], p._model.x + x, p._model.y + y + 15);
                        });
                    });
                }
            },
            legend: {
                display: true,
                labels: {}
            }
        };
        //
        //
        this.data = [];
        this.hidden = true;
        console.log("pie chart component constructor");
    }
    PieChartDemoComponent.prototype.ngOnInit = function () {
        console.log("ngOnInit " + this._tableService.getChartData());
        this.initListeners();
    };
    PieChartDemoComponent.prototype.ngOnChanges = function () {
        if (this.data != null) {
            // your code here.
            if (this.data.length > 0) {
                this.handleOnConfirm();
            }
        }
    };
    PieChartDemoComponent.prototype.initListeners = function () {
        this.subscriptions.push(this._tableService
            .pieChartListener()
            .subscribe(function () {
            console.log("pie chart manipulation");
        }));
    };
    PieChartDemoComponent.prototype.chartClicked = function (e) {
        console.log(e);
    };
    PieChartDemoComponent.prototype.chartHovered = function (e) {
        console.log(e);
    };
    PieChartDemoComponent.prototype.handleOnConfirm = function () {
        var _this = this;
        console.log('handleOnConfirm', this.data);
        this.pieChartData = [];
        this.data.forEach(function (value) {
            _this.pieChartData.push(value.count);
            _this.pieChartLabels.push(value.pieChartLabel);
            _this.pieChartcolors[0].backgroundColor.push(value.color);
            console.log(value.pieChartLabel);
        });
        console.log("pie chart data" + this.pieChartData);
    };
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], PieChartDemoComponent.prototype, "data", void 0);
    __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Input"])(),
        __metadata("design:type", Object)
    ], PieChartDemoComponent.prototype, "hidden", void 0);
    PieChartDemoComponent = __decorate([
        __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["Component"])({
            selector: 'pie-chart-demo',
            template: "\n\n   <div [hidden]=\"hidden\"  *ngIf='!!pieChartData.length' style=\"width:60%;height:60%;position:relative;justify-content:center;margin: auto;\">\n  <canvas  baseChart\n          [data]=\"pieChartData\"\n          [labels]=\"pieChartLabels\"\n          [chartType]=\"pieChartType\"\n          [colors]=\"pieChartcolors\"\n          [options]=\"pieChartOptions\"\n          (chartHover)=\"chartHovered($event)\"\n          (chartClick)=\"chartClicked($event)\"></canvas>\n</div>\n",
            providers: [__WEBPACK_IMPORTED_MODULE_1__piechart_service__["a" /* PieChartServiceData */]]
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__piechart_service__["a" /* PieChartServiceData */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__piechart_service__["a" /* PieChartServiceData */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_2__fetch_service__["a" /* TableService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__fetch_service__["a" /* TableService */]) === "function" && _b || Object])
    ], PieChartDemoComponent);
    return PieChartDemoComponent;
    var _a, _b;
}());

//# sourceMappingURL=piechartdemo.component.js.map

/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
var environment = {
    production: true
};
//# sourceMappingURL=environment.js.map

/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/@angular/platform-browser-dynamic.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    __webpack_require__.i(__WEBPACK_IMPORTED_MODULE_0__angular_core__["enableProdMode"])();
}
__webpack_require__.i(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),

/***/ "../../../../moment/locale recursive ^\\.\\/.*$":
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"./af": "../../../../moment/locale/af.js",
	"./af.js": "../../../../moment/locale/af.js",
	"./ar": "../../../../moment/locale/ar.js",
	"./ar-dz": "../../../../moment/locale/ar-dz.js",
	"./ar-dz.js": "../../../../moment/locale/ar-dz.js",
	"./ar-kw": "../../../../moment/locale/ar-kw.js",
	"./ar-kw.js": "../../../../moment/locale/ar-kw.js",
	"./ar-ly": "../../../../moment/locale/ar-ly.js",
	"./ar-ly.js": "../../../../moment/locale/ar-ly.js",
	"./ar-ma": "../../../../moment/locale/ar-ma.js",
	"./ar-ma.js": "../../../../moment/locale/ar-ma.js",
	"./ar-sa": "../../../../moment/locale/ar-sa.js",
	"./ar-sa.js": "../../../../moment/locale/ar-sa.js",
	"./ar-tn": "../../../../moment/locale/ar-tn.js",
	"./ar-tn.js": "../../../../moment/locale/ar-tn.js",
	"./ar.js": "../../../../moment/locale/ar.js",
	"./az": "../../../../moment/locale/az.js",
	"./az.js": "../../../../moment/locale/az.js",
	"./be": "../../../../moment/locale/be.js",
	"./be.js": "../../../../moment/locale/be.js",
	"./bg": "../../../../moment/locale/bg.js",
	"./bg.js": "../../../../moment/locale/bg.js",
	"./bn": "../../../../moment/locale/bn.js",
	"./bn.js": "../../../../moment/locale/bn.js",
	"./bo": "../../../../moment/locale/bo.js",
	"./bo.js": "../../../../moment/locale/bo.js",
	"./br": "../../../../moment/locale/br.js",
	"./br.js": "../../../../moment/locale/br.js",
	"./bs": "../../../../moment/locale/bs.js",
	"./bs.js": "../../../../moment/locale/bs.js",
	"./ca": "../../../../moment/locale/ca.js",
	"./ca.js": "../../../../moment/locale/ca.js",
	"./cs": "../../../../moment/locale/cs.js",
	"./cs.js": "../../../../moment/locale/cs.js",
	"./cv": "../../../../moment/locale/cv.js",
	"./cv.js": "../../../../moment/locale/cv.js",
	"./cy": "../../../../moment/locale/cy.js",
	"./cy.js": "../../../../moment/locale/cy.js",
	"./da": "../../../../moment/locale/da.js",
	"./da.js": "../../../../moment/locale/da.js",
	"./de": "../../../../moment/locale/de.js",
	"./de-at": "../../../../moment/locale/de-at.js",
	"./de-at.js": "../../../../moment/locale/de-at.js",
	"./de-ch": "../../../../moment/locale/de-ch.js",
	"./de-ch.js": "../../../../moment/locale/de-ch.js",
	"./de.js": "../../../../moment/locale/de.js",
	"./dv": "../../../../moment/locale/dv.js",
	"./dv.js": "../../../../moment/locale/dv.js",
	"./el": "../../../../moment/locale/el.js",
	"./el.js": "../../../../moment/locale/el.js",
	"./en-au": "../../../../moment/locale/en-au.js",
	"./en-au.js": "../../../../moment/locale/en-au.js",
	"./en-ca": "../../../../moment/locale/en-ca.js",
	"./en-ca.js": "../../../../moment/locale/en-ca.js",
	"./en-gb": "../../../../moment/locale/en-gb.js",
	"./en-gb.js": "../../../../moment/locale/en-gb.js",
	"./en-ie": "../../../../moment/locale/en-ie.js",
	"./en-ie.js": "../../../../moment/locale/en-ie.js",
	"./en-nz": "../../../../moment/locale/en-nz.js",
	"./en-nz.js": "../../../../moment/locale/en-nz.js",
	"./eo": "../../../../moment/locale/eo.js",
	"./eo.js": "../../../../moment/locale/eo.js",
	"./es": "../../../../moment/locale/es.js",
	"./es-do": "../../../../moment/locale/es-do.js",
	"./es-do.js": "../../../../moment/locale/es-do.js",
	"./es.js": "../../../../moment/locale/es.js",
	"./et": "../../../../moment/locale/et.js",
	"./et.js": "../../../../moment/locale/et.js",
	"./eu": "../../../../moment/locale/eu.js",
	"./eu.js": "../../../../moment/locale/eu.js",
	"./fa": "../../../../moment/locale/fa.js",
	"./fa.js": "../../../../moment/locale/fa.js",
	"./fi": "../../../../moment/locale/fi.js",
	"./fi.js": "../../../../moment/locale/fi.js",
	"./fo": "../../../../moment/locale/fo.js",
	"./fo.js": "../../../../moment/locale/fo.js",
	"./fr": "../../../../moment/locale/fr.js",
	"./fr-ca": "../../../../moment/locale/fr-ca.js",
	"./fr-ca.js": "../../../../moment/locale/fr-ca.js",
	"./fr-ch": "../../../../moment/locale/fr-ch.js",
	"./fr-ch.js": "../../../../moment/locale/fr-ch.js",
	"./fr.js": "../../../../moment/locale/fr.js",
	"./fy": "../../../../moment/locale/fy.js",
	"./fy.js": "../../../../moment/locale/fy.js",
	"./gd": "../../../../moment/locale/gd.js",
	"./gd.js": "../../../../moment/locale/gd.js",
	"./gl": "../../../../moment/locale/gl.js",
	"./gl.js": "../../../../moment/locale/gl.js",
	"./gom-latn": "../../../../moment/locale/gom-latn.js",
	"./gom-latn.js": "../../../../moment/locale/gom-latn.js",
	"./he": "../../../../moment/locale/he.js",
	"./he.js": "../../../../moment/locale/he.js",
	"./hi": "../../../../moment/locale/hi.js",
	"./hi.js": "../../../../moment/locale/hi.js",
	"./hr": "../../../../moment/locale/hr.js",
	"./hr.js": "../../../../moment/locale/hr.js",
	"./hu": "../../../../moment/locale/hu.js",
	"./hu.js": "../../../../moment/locale/hu.js",
	"./hy-am": "../../../../moment/locale/hy-am.js",
	"./hy-am.js": "../../../../moment/locale/hy-am.js",
	"./id": "../../../../moment/locale/id.js",
	"./id.js": "../../../../moment/locale/id.js",
	"./is": "../../../../moment/locale/is.js",
	"./is.js": "../../../../moment/locale/is.js",
	"./it": "../../../../moment/locale/it.js",
	"./it.js": "../../../../moment/locale/it.js",
	"./ja": "../../../../moment/locale/ja.js",
	"./ja.js": "../../../../moment/locale/ja.js",
	"./jv": "../../../../moment/locale/jv.js",
	"./jv.js": "../../../../moment/locale/jv.js",
	"./ka": "../../../../moment/locale/ka.js",
	"./ka.js": "../../../../moment/locale/ka.js",
	"./kk": "../../../../moment/locale/kk.js",
	"./kk.js": "../../../../moment/locale/kk.js",
	"./km": "../../../../moment/locale/km.js",
	"./km.js": "../../../../moment/locale/km.js",
	"./kn": "../../../../moment/locale/kn.js",
	"./kn.js": "../../../../moment/locale/kn.js",
	"./ko": "../../../../moment/locale/ko.js",
	"./ko.js": "../../../../moment/locale/ko.js",
	"./ky": "../../../../moment/locale/ky.js",
	"./ky.js": "../../../../moment/locale/ky.js",
	"./lb": "../../../../moment/locale/lb.js",
	"./lb.js": "../../../../moment/locale/lb.js",
	"./lo": "../../../../moment/locale/lo.js",
	"./lo.js": "../../../../moment/locale/lo.js",
	"./lt": "../../../../moment/locale/lt.js",
	"./lt.js": "../../../../moment/locale/lt.js",
	"./lv": "../../../../moment/locale/lv.js",
	"./lv.js": "../../../../moment/locale/lv.js",
	"./me": "../../../../moment/locale/me.js",
	"./me.js": "../../../../moment/locale/me.js",
	"./mi": "../../../../moment/locale/mi.js",
	"./mi.js": "../../../../moment/locale/mi.js",
	"./mk": "../../../../moment/locale/mk.js",
	"./mk.js": "../../../../moment/locale/mk.js",
	"./ml": "../../../../moment/locale/ml.js",
	"./ml.js": "../../../../moment/locale/ml.js",
	"./mr": "../../../../moment/locale/mr.js",
	"./mr.js": "../../../../moment/locale/mr.js",
	"./ms": "../../../../moment/locale/ms.js",
	"./ms-my": "../../../../moment/locale/ms-my.js",
	"./ms-my.js": "../../../../moment/locale/ms-my.js",
	"./ms.js": "../../../../moment/locale/ms.js",
	"./my": "../../../../moment/locale/my.js",
	"./my.js": "../../../../moment/locale/my.js",
	"./nb": "../../../../moment/locale/nb.js",
	"./nb.js": "../../../../moment/locale/nb.js",
	"./ne": "../../../../moment/locale/ne.js",
	"./ne.js": "../../../../moment/locale/ne.js",
	"./nl": "../../../../moment/locale/nl.js",
	"./nl-be": "../../../../moment/locale/nl-be.js",
	"./nl-be.js": "../../../../moment/locale/nl-be.js",
	"./nl.js": "../../../../moment/locale/nl.js",
	"./nn": "../../../../moment/locale/nn.js",
	"./nn.js": "../../../../moment/locale/nn.js",
	"./pa-in": "../../../../moment/locale/pa-in.js",
	"./pa-in.js": "../../../../moment/locale/pa-in.js",
	"./pl": "../../../../moment/locale/pl.js",
	"./pl.js": "../../../../moment/locale/pl.js",
	"./pt": "../../../../moment/locale/pt.js",
	"./pt-br": "../../../../moment/locale/pt-br.js",
	"./pt-br.js": "../../../../moment/locale/pt-br.js",
	"./pt.js": "../../../../moment/locale/pt.js",
	"./ro": "../../../../moment/locale/ro.js",
	"./ro.js": "../../../../moment/locale/ro.js",
	"./ru": "../../../../moment/locale/ru.js",
	"./ru.js": "../../../../moment/locale/ru.js",
	"./sd": "../../../../moment/locale/sd.js",
	"./sd.js": "../../../../moment/locale/sd.js",
	"./se": "../../../../moment/locale/se.js",
	"./se.js": "../../../../moment/locale/se.js",
	"./si": "../../../../moment/locale/si.js",
	"./si.js": "../../../../moment/locale/si.js",
	"./sk": "../../../../moment/locale/sk.js",
	"./sk.js": "../../../../moment/locale/sk.js",
	"./sl": "../../../../moment/locale/sl.js",
	"./sl.js": "../../../../moment/locale/sl.js",
	"./sq": "../../../../moment/locale/sq.js",
	"./sq.js": "../../../../moment/locale/sq.js",
	"./sr": "../../../../moment/locale/sr.js",
	"./sr-cyrl": "../../../../moment/locale/sr-cyrl.js",
	"./sr-cyrl.js": "../../../../moment/locale/sr-cyrl.js",
	"./sr.js": "../../../../moment/locale/sr.js",
	"./ss": "../../../../moment/locale/ss.js",
	"./ss.js": "../../../../moment/locale/ss.js",
	"./sv": "../../../../moment/locale/sv.js",
	"./sv.js": "../../../../moment/locale/sv.js",
	"./sw": "../../../../moment/locale/sw.js",
	"./sw.js": "../../../../moment/locale/sw.js",
	"./ta": "../../../../moment/locale/ta.js",
	"./ta.js": "../../../../moment/locale/ta.js",
	"./te": "../../../../moment/locale/te.js",
	"./te.js": "../../../../moment/locale/te.js",
	"./tet": "../../../../moment/locale/tet.js",
	"./tet.js": "../../../../moment/locale/tet.js",
	"./th": "../../../../moment/locale/th.js",
	"./th.js": "../../../../moment/locale/th.js",
	"./tl-ph": "../../../../moment/locale/tl-ph.js",
	"./tl-ph.js": "../../../../moment/locale/tl-ph.js",
	"./tlh": "../../../../moment/locale/tlh.js",
	"./tlh.js": "../../../../moment/locale/tlh.js",
	"./tr": "../../../../moment/locale/tr.js",
	"./tr.js": "../../../../moment/locale/tr.js",
	"./tzl": "../../../../moment/locale/tzl.js",
	"./tzl.js": "../../../../moment/locale/tzl.js",
	"./tzm": "../../../../moment/locale/tzm.js",
	"./tzm-latn": "../../../../moment/locale/tzm-latn.js",
	"./tzm-latn.js": "../../../../moment/locale/tzm-latn.js",
	"./tzm.js": "../../../../moment/locale/tzm.js",
	"./uk": "../../../../moment/locale/uk.js",
	"./uk.js": "../../../../moment/locale/uk.js",
	"./ur": "../../../../moment/locale/ur.js",
	"./ur.js": "../../../../moment/locale/ur.js",
	"./uz": "../../../../moment/locale/uz.js",
	"./uz-latn": "../../../../moment/locale/uz-latn.js",
	"./uz-latn.js": "../../../../moment/locale/uz-latn.js",
	"./uz.js": "../../../../moment/locale/uz.js",
	"./vi": "../../../../moment/locale/vi.js",
	"./vi.js": "../../../../moment/locale/vi.js",
	"./x-pseudo": "../../../../moment/locale/x-pseudo.js",
	"./x-pseudo.js": "../../../../moment/locale/x-pseudo.js",
	"./yo": "../../../../moment/locale/yo.js",
	"./yo.js": "../../../../moment/locale/yo.js",
	"./zh-cn": "../../../../moment/locale/zh-cn.js",
	"./zh-cn.js": "../../../../moment/locale/zh-cn.js",
	"./zh-hk": "../../../../moment/locale/zh-hk.js",
	"./zh-hk.js": "../../../../moment/locale/zh-hk.js",
	"./zh-tw": "../../../../moment/locale/zh-tw.js",
	"./zh-tw.js": "../../../../moment/locale/zh-tw.js"
};
function webpackContext(req) {
	return __webpack_require__(webpackContextResolve(req));
};
function webpackContextResolve(req) {
	var id = map[req];
	if(!(id + 1)) // check for number or string
		throw new Error("Cannot find module '" + req + "'.");
	return id;
};
webpackContext.keys = function webpackContextKeys() {
	return Object.keys(map);
};
webpackContext.resolve = webpackContextResolve;
module.exports = webpackContext;
webpackContext.id = "../../../../moment/locale recursive ^\\.\\/.*$";

/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map