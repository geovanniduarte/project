/**
 * 
 */
var app=angular.module("app", ['ui.router', 'ngResource', 'ClienteaApp.service', 'ClienteApp.controller', 'ProyectoApp.controller', 'UsuarioApp.controller']);

app.config(function($stateProvider) {	
	$stateProvider.state('clientes', {
		url: '/clientes',
		templateUrl: 'modulos/clientes.html',
		controller: 'ClienteListController'		
	}).state('clientes.listCliente', {
		url: '/clientes/clientes',
		templateUrl: 'modulos/clientes/clientes.html',
		controller: 'ClienteListController'
	}).state('clientes.viewCliente', {
		url: '/clientes/:clieid/view',
		templateUrl: 'modulos/clientes/cliente-view.html',
		controller: 'ClienteViewController'
	}).state('clientes.newCliente', {
		url: '/clientes/new',
		templateUrl: 'modulos/clientes/cliente-add.html',
		controller: 'ClienteCreateController',
	}).state('clientes.editCliente', {
		url: '/clientes/:clieid/edit',
		templateUrl: 'modulos/clientes/cliente-edit.html',
		controller: 'ClienteUpdateController'
	});
	
	$stateProvider.state('proyectos', {
		url:'/proyectos',
		templateUrl: 'modulos/proyectos/proyectos.html',
		controller: 'ProyectoListController'
	});
	
	$stateProvider.state('usuarios', {
		url:'/proyectos',
		templateUrl: 'modulos/usuarios/usuarios.html',
		controller: 'UsuarioListController'
	});
});