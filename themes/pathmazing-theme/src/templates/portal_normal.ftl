<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div class="container-fluid" id="wrapper">
	<header id="banner" role="banner">
		<#assign current_page = "${the_title}"/>
		<#if current_page == "Home">
			<#assign header_container = "heading-home"/>
		<#else>
			<#assign
				header_container = "heading"
			/>
		</#if>
		<div id="${header_container}">
			<div class="site-title">
				<a class="${logo_css_class} dis-dt" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
					<img alt="${logo_description}" height="${site_logo_height}" src="${pathmazing_site_log_desktop}" width="${site_logo_width}" />
				</a>
				<#--<a class="${logo_css_class} dis-mobile" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
					<img alt="${logo_description}" height="${site_logo_height}" src="${pathmazing_site_log}" width="${site_logo_width}" />
				</a>-->

				<#--<#if show_site_name>
					<span class="site-name" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
						${site_name}
					</span>
				</#if>-->
			</div>
            <div class="navigation-container">
                <#if has_navigation && is_setup_complete>
                    <#include "${full_templates_path}/navigation.ftl" />
                </#if>
            </div>
			<#--<p>${the_title}</p>-->
		</div>

		<#--<#if !is_signed_in>
			<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
		</#if>-->
	</header>

	<section id="content">
		<h1 class="hide-accessible">${the_title}</h1>

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>

	<footer id="footer" role="contentinfo">
		<#include "${full_templates_path}/footer.ftl" />
		<#--<p class="powered-by">
			<@liferay.language key="powered-by" /> <a href="http://www.liferay.com" rel="external">Liferay</a>
		</p>-->
	</footer>
</div>
<script src="${javascript_folder}/wow.js"></script>
<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>
