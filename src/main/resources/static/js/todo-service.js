app.factory('TodoService', ['$resource', function($resource){
    return $resource('/todos/:id', {}, {
        'query' : {method: 'GET', isArray: true},
        'delete': {method: 'DELETE', params: {id: '@id'}}
    });
}]);