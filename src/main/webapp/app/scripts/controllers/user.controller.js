var app = angular.module('user');

app.controller('userController', userController);

function userController($scope, userService) {
	var vm = this;
	vm.getUsers = getUsers;
	vm.getBooks = getBooks;
	vm.getGreetingFromHeroku = getGreetingFromHeroku;

	vm.users = [];
	
	init();
	
	function init() {
		console.log("Controller initialized.");
	}

	function getUsers() {
		var promise = userService.getUsers();
		promise.then(function(response){
			vm.users = response.data;
			console.log("Users : "+JSON.stringify(vm.users));
		});
	}
	
	function getBooks() {
		var promise = userService.getBooks();
		promise.then(function(response){
			vm.bookData = response.data;
		});
	}
	
	function getGreetingFromHeroku() {
		var promise = userService.getGreetingFromHeroku();
		promise.then(function(response){
			vm.greeting = response.data;
			console.log("Greeting : "+JSON.stringify(vm.greeting));
		});
	}
	
	$scope.get = function() {
		console.log("inside get");
	}
}