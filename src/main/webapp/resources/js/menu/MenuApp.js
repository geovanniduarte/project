/**
 * 
 */
var app=angular.module("app", ['ui.router', 'ngResource', 'ClienteaApp.service', 'ClienteApp.controller']);

app.config(function($stateProvider) {	
	$stateProvider.state('clientes',{
		url: '/clientes',
		templateUrl: 'modulos/cliente.html',
		controller: 'ClienteListController'		
	}).state('clientes.viewCliente', {
		url: 'clientes/:clieid/view',
		templateUrl: 'modulos/cliente/cliente-view.html',
		controller: 'ClienteViewController'
	}).state('clientes.newCliente', {
		url: '/clientes/new',
		templateUrl: 'modulos/cliente/cliente-add.html',
		controller: 'ClienteCreateController',
	}).state('clientes.editCliente', {
		url: 'clientes/:clieid/edit',
		templateUrl: 'modulos/cliete/cliente-edit.html',
		controller: 'ClienteUpdateController'
	});
});