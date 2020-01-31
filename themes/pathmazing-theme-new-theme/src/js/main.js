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
		var _oldScroll = 0;
		$(window).scroll(function(){
			if($(window).scrollTop() > _oldScroll){
				onNavigationFullScreen();
			} else {
				onNavigationPadding();
			}
			_oldScroll = $(window).scrollTop();
		});
	}
);

var nav_heading = document.getElementById('heading');
function onNavigationFullScreen() {
	nav_heading.style.display = 'flex';
	nav_heading.style.flexDirection = 'row';
	nav_heading.style.padding = '8px 16px';
	nav_heading.style.alignItems = 'baseline';
	nav_heading.style.zIndex = '999';
	nav_heading.style.width = '100%';
	nav_heading.style.marginLeft = '0';
	nav_heading.style.marginTop = '0';
	nav_heading.style.backgroundColor = 'rgba($nav_background_color, 0.9)';
	nav_heading.style.borderRadius = '0';
	nav_heading.style.position = 'fixed';
	nav_heading.style.opacity = '1.0';
	nav_heading.style.justifyContent = 'space-between';
}

function onNavigationPadding() {
	nav_heading.style.display = 'flex';
	nav_heading.style.flexDirection = 'row';
	nav_heading.style.padding = '8px 16px';
	nav_heading.style.alignItems = 'baseline';
	nav_heading.style.zIndex = '999';
	nav_heading.style.width = '80%';
	nav_heading.style.marginLeft = '10%';
	nav_heading.style.marginTop = '16px';
	nav_heading.style.backgroundColor = 'rgba($nav_background_color, 0.9)';
	nav_heading.style.borderRadius = '16px';
	nav_heading.style.position = 'fixed';
	nav_heading.style.opacity = '1.0';
	nav_heading.style.justifyContent = 'space-between';
}