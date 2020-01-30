<div id="footer-container">
    <div class="footer-site-logo" id="footer-site-logo">
        <a class="${logo_css_class} dis-dt" id="footer-site-logo-container" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
            <img id="footer-site-logo" alt="${logo_description}" height="${site_logo_height}" src="${pathmazing_site_log_desktop}" width="${site_logo_width}" />
        </a>
    </div>
    <div class="footer-navigation-container" id="footer-navigation-container">
        <#if has_navigation && is_setup_complete>
            <#include "${full_templates_path}/navigation.ftl" />
        </#if>
    </div>
</div>