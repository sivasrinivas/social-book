function messageCtrl($scope, $http) {

    $http.get('http://localhost:9999/socialbook/app/messages').
        success(function(data) {
            $scope.messages = data;
        });

}
messageCtrl.$inject = ['$scope', '$http'];
 angular.module('socialBookApp', []).controller('messageCtrl', messageCtrl)
