JW_APP_NAME.directive('spectrum',['$rootScope',function($rootScope) {
    return {
        restrict: 'A',
        replace: true,
        scope: {
            options: '@'
        },
        link: function(scope, element, attrs) {
            var optObject = JSON.parse(scope.options);
            $(element).spectrum(optObject);
        }
    };
}]);
