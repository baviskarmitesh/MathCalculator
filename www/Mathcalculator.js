var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'Mathcalculator', 'coolMethod', [arg0]);
};

module.exports.add = function(arg0,success,error){
    exec(success, error, 'Mathcalculator','add', [arg0])
}
module.exports.sub = function(arg0,success,error){
    exec(success, error, 'Mathcalculator','sub', [arg0])
}
module.exports.mul = function(arg0,success,error){
    exec(success, error, 'Mathcalculator','mul', [arg0])
}
module.exports.div = function(arg0,success,error){
    exec(success, error, 'Mathcalculator','div', [arg0])
}