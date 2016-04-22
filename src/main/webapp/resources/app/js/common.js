
function clr(){
		$(':input','#x')
		 .not(':button, :submit, :reset, :hidden')
		 .val('')
		 .removeAttr('checked')
		 .removeAttr('selected');
	}
	function redirect(){
		window.location = "/nenasalaproject/Admin/Employee/";
	}


var today = new Date();
$(function() {
	$(".dpicker").datepicker(
			{
				dateFormat : "yy-mm-dd",
				changeMonth : true,
				changeYear : true,

				maxDate : new Date(today.getFullYear() - 18, today.getMonth(),
						today.getDay()),
				minDate : new Date(today.getFullYear() - 55, today.getMonth(),
						today.getDay())
			});
});

$(function men(){
	var loc = window.location.href;
	$(".has-sub ul li a").each(function() {
			if(loc.indexOf(this.href)!=-1) {
 			$(this).parents("li").addClass(' active');
			}
	});  
});




    $('#x').validate({
submitHandler: function (form) { // for demo
    alert('valid form');
    return false;
}
});

$('.name').each(function() {
$(this).rules('add', {
    required: true,
    minlength: 5,
    maxlength: 500,
    messages: {
        required: "Required input",
        minlength: "Must be at least {0} characters",
        maxlength: "Must be less than {0} characters"
    }
});

});

$('.email').each(function() {
$(this).rules('add', {
    required: true,
                email: true,
    messages: {
        required: "Please enter an email",
        email: "Please enter a valid email address"
    }
});

});

$('.pwd').each(function() {
$(this).rules('add', {
    required: true,
                minlength: 5,
    messages: {
        required: "Please enter a password",
        email: "Please enter a valid password"
    }
});

});



