select  REGISTER_ID, wr.COMPANY_ID as system_Id,
REGISTER_NAME, REGISTER_PWD, WX_ACCOUNT, BIND_DATE 
 from  wechat_register wr 
 join wechat_system s on wr.company_id = s.company_id
 where 1=1 
<#if wechatRegister.registerId ? exists>
	and register_id = ${ wechatRegister.registerId}
</#if>
<#if wechatRegister.systemId ? exists>
	and system_id = ${ wechatRegister.systemId}
</#if>
<#if wechatRegister.registerName ? exists>
	and register_name = '${ wechatRegister.registerName}'
</#if>
<#if wechatRegister.registerPwd ? exists>
	and register_pwd = '${ wechatRegister.registerPwd}'
</#if>
<#if wechatRegister.wxAccount ? exists>
	and wx_account = '${ wechatRegister.wxAccount}'
</#if>
