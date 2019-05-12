 $(document).ready(function () {
         $.ajax({
             type: "GET",
             dataType: "json",
             url: "http://localhost:8080/v1/manthan/",
             success: function(data){
               var customerData='';
               $.each(data, function(key,value){
                    customerData+='<option value='+value.id+'>'+value.name+'</option>';
               });
               $('#customerSelect').append(customerData);
             }
         })
});

$('#customerSelect').change(function(){
var customerId = $(this).val();
alert(customerId);
$.ajax({
             type: "GET",
             dataType: "json",
             url: "http://localhost:8080/v1/manthan/id/"+customerId,
             success: function(data){
             console.log(data);
               var customerInfo='<tbody>';
               $.each(data, function(key,value){
                    customerInfo+='<tr>';
					customerInfo+='<td>'+value.name+'</td>';
					customerInfo+='<td>'+value.age+'</td>';
					customerInfo+='<td>'+value['gender']['name']+'</td>';
					customerInfo+='<td>'+value['education']['name']+'</td>';
					customerInfo+='<td>'+value['marriage']['name']+'</td>';
					customerInfo+='<td>'+value['defaultPayment']['name']+'</td>';
					customerInfo+='</tr>';
               });
			   customerInfo+='</tbody>';
               $('#customerData').append(customerData);
             }
         })
});