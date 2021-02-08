function validatePayment(){
	
	var cno;
	var sno;
	var number = /^[0-9]+$/;
	
	
	
	if(document.paymentform.cardNo.value.match(number) && document.paymentform.secCode.value.match(number)){
		
		
		
		return true;
		
	}else{
		
		alert("Please enter numbers for card number and security code");
		
		return false;
		
	}
}