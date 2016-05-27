var Product = function(){	
	this.formProduct = $('#formProduct');	
}

Product.prototype.init = function(){
	var obj = this;
	obj.handler();
}

Product.prototype.handler = function(){
	var obj = this;
	
	
	obj.formProduct.on('submit',function(){
		$.ajax({
			url: obj.formProduct.attr('action'),
			data:obj.formProduct.serialize(),
			type:'post',
			beforeSend:function(x){
				$('#btnGrabar').val('Grabando...');
			},
			success:function(data){
				console.log('success');
				$('#btnGrabar').val('Guardar');
				$('#mensajeGuardo').show();
			},
			error:function(e){
				console.log('erro');
			}	
			});
		
		return false;
	});

}
