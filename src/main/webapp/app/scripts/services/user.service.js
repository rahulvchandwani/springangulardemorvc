var app = angular.module('user', []);

app.factory('userService', userService);

function userService($http) {
	return {
		getUsers : getUsers,
		getBooks : getBooks,
		getGreetingFromHeroku : getGreetingFromHeroku
	}

	function getUsers() {
		var url = '/user/getUsers';
		return $http.get(url);
	}
	
	function getBooks() {
		var url = "https://whispering-woodland-9020.herokuapp.com/getAllBooks";
		return $http.get(url);
	}
	
	function getGreetingFromHeroku() {
		var url = "http://rest-service.guides.spring.io/greeting";
		return $http.get(url);
	}
}