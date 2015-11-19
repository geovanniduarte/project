/**
 * 
 */
/*
var app=angular.module("app");

function RemoteResource($http,baseUrl) {
	this.request = function(fnOK,fnError,object) {		
		$http.post(baseUrl, object)
		.success(function(data, status, header, config){
			fnOK(data);
		}) 
		.error(function(data, status, header, config){
			fnError(data, status);
		});
	}
}

function RemoteResourceProvider() {
	var _baseUrl;	
	this.setBaseUrl = function(baseUrl) {
		_baseUrl = baseUrl;
	}
	
	this.$get = ['$http', function($http){
		return new RemoteResource($http, _baseUrl);
	}];
}

app.provider('remoteResource', RemoteResourceProvider);
app.constant('baseUrl','http://localhost:8080/pyr/ws/clientes/create');
app.config(['baseUrl', 'remoteResourceProvider', function(baseUrl, remoteResourceProvider) {
	remoteResourceProvider.setBaseUrl(baseUrl);
}]);

var clienteApp = angular.module('ClienteApp', ['ui.router', 'ngResource', 'clienteApp.service', 'clienteApp.controller', 'app']);
clienteApp.config(function($stateProvider) {
	$stateProvider.state('clientes',{
		url: '/clientes',
		templateUrl: 'modulos/cliente.html',
		controller: 'ClienteListController'		
	}).state('viewCliente', {
		url: 'clientes/:clieid/view',
		templateUrl: 'modulos/cliente/cliente-view.html',
		controller: 'ClienteViewController'
	}).state('newCliente', {
		url: '/clientes/new',
		templateUrl: 'modulos/cliente/cliente-add.html',
		controller: 'ClienteCreateController',
	}).state('editCliente', {
		url: 'clientes/:clieid/edit',
		templateUrl: 'modulos/cliete/cliente-edit.html',
		controller: 'ClienteUpdateController'
	}).run(function($state) {
		$state.go('clientes');
	})
});


*/


