AUI().ready(

	/*
	This function gets loaded when all the HTML, not including the portlets, is
	loaded.
	*/

	function() {
	}
);

Liferay.Portlet.ready(

	/*
	This function gets loaded after each and every portlet on the page.

	portletId: the current portlet's id
	node: the Alloy Node object of the current portlet
	*/

	function(portletId, node) {
	}
);

Liferay.on(
	'allPortletsReady',

	/*
	This function gets loaded when everything, including the portlets, is on
	the page.
	*/

	function() {
		var heading = document.getElementById('heading-home').style;
		var site_logo_container = document.getElementById('site-logo-container').style;
		var site_logo = document.getElementById('site-logo').style;
		$(window).scroll(function(){
			if($(window).scrollTop() > 100){
				heading.display = 'flex';
				heading.flexDirection = "row";
				heading.backgroundColor = 'rgba(32,34,35,0.7)';
				heading.padding = '8px 24px 8px 16px';
				heading.alignItems = 'baseline';
				heading.position = 'fixed';
				heading.zIndex = '999';
				heading.width = '100%';
				heading.height = 'auto';

				site_logo_container.maxWidth = '320px';

				site_logo.margin = 'auto 0px';
				site_logo.height = '50px';
				site_logo.width = '80%';
			} else {
				site_logo.margin = 'auto 0px';
				site_logo.height = '70%';
				site_logo.width = '90%';

				/*heading.webkitAnimationName = 'animateToTop'; /!* Safari 4.0 - 8.0 *!/
				heading.webkitAnimationDuration = '0.3s'; /!* Safari 4.0 - 8.0 *!/
				heading.animationName = 'animateToTop';
				heading.animationDuration = '0.3s';*/

				site_logo_container.maxWidth = '620px';

				heading.display = 'flex';
				heading.flexDirection = 'row';
				heading.padding = '24px 12%';
				heading.alignItems = 'baseline';
				heading.zIndex = '999';
				heading.width = '100%';
				heading.background  = 'linear-gradient(to top, rgba(8, 8, 8, 0), rgba(8, 8, 8, 0.62), #080808)';
				heading.height  = '211px';
			}
		})

	}
);