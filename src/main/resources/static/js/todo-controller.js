app.controller('TodoController', ['$scope', 'TodoService',
    function($scope, TodoService){
        $scope.newTodo = '';

        $scope.todos = TodoService.query();

        $scope.addTodo = function()
        {
            TodoService.save({description: $scope.newTodo});
            TodoService.query();
        };
    }]);