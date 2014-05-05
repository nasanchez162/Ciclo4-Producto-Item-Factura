define([], function() {
    App.Model._FacturaModel = Backbone.Model.extend({
        defaults: {
 
		 'fecha' : ''
 ,  
		 'costoTotal' : ''
 ,  
		 'itemId' : ''
        },
        initialize: function() {
        },
        getDisplay: function(name) {
			 if(name=='itemId'){  
                 var value = App.Utils.getModelFromCache('itemComponent',this.get('itemId'));
                 if(value) 
                 return value.get('name');
             }
         return this.get(name);
        }
    });

    App.Model._FacturaList = Backbone.Collection.extend({
        model: App.Model._FacturaModel,
        initialize: function() {
        }

    });
    return App.Model._FacturaModel;
});