app.factory('TodoService', ['$resource', function($resource){
    return $resource('/todos', {}, {
       'query' : {method: 'GET', isArray: true},
       'save' :{method:'POST'}
    });
}]);