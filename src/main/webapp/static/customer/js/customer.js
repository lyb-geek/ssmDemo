var base = document.getElementById("base").href;
var customerDemoVM = new Vue({
		el: '#customerVM',
		data:{
			pageList: []
		},
		mounted: function(){
			
		},
		created: function(){
			this.getCustomerList();
			
		},
		methods:{
			getCustomerList:function(){
				$.ajax({
					url : base+"/customer/getCustomerList",
					type : "POST",
					dateType : "json",
					data : {
						"employeeId":"ff8080812fc95ce9012fcbc65b837310"
					},
					success : function(resultData) {
						if(resultData && resultData.code == 200){
							customerDemoVM.pageList = resultData.data;
						}
						
					}
				});
			}
		
			
		}
		
});