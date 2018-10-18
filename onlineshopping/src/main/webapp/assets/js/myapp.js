$(function()
{
	switch(menu)
	{
	  case 'About Us':
		  $('#aboutus').addClass('active');
		  break;
	  case 'Contact Us':
		  $('#contact').addClass('active');
		  break;
	   default:
		   $('#Home').addClass('active');
	   break;
	}

});