/**
 * 
 */
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


