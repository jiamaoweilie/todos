app.controller('TodoController', ['$scope', 'TodoService',
    function ($scope, TodoService) {
        $scope.newTodo = '';

        $scope.todos = TodoService.query();

        $scope.add = function () {
            TodoService.save({description: $scope.newTodo})
            $scope.todos = TodoService.query();
        };

        $scope.delete = function(id){
            TodoService.delete({id : id});
            $scope.todos = TodoService.query();
        };
    }]);