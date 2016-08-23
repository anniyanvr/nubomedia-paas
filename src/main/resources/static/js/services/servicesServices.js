
/*
 *
 *  * Copyright (c) 2016 Open Baton
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  
 */

angular.module('app').factory('serviceAPI', function(http, $q) {

    var services = {};

    services.getNetworks = function() {
        var deferred = $q.defer();
        http.get(url + '/networks').success(function(data, status) {
            deferred.resolve(data);
        });
        return deferred.promise;
    };
    /*
     * 
     * @returns {List} List of Services
     */
    services.getServices = function() {
        var deferred = $q.defer();
        http.get(url + '/services').success(function(data, status) {
            deferred.resolve(data);
        });
        return deferred.promise;
    };

    /* Random number
     * 
     * @returns {Number}
     */
    services.getRandom = function() {
        return Math.floor((Math.random() * 100) + 1);
    };
    /** return an array of keys by value
     *
     * @param {type} obj
     * @param {type} value
     * @returns {Array}
     */
    services.returnKeys = function returnKeys(obj, value) {
        var keys = [];
        _.each(obj, function(val, key) {
            if (val === value) {
                keys.push(key);
            }
        });
        return keys;
    };
    
    return services;
});