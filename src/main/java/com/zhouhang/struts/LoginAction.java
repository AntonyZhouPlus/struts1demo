package com.zhouhang.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // 转换成LoginForm
        LoginForm login = (LoginForm) form;
        if (login.getUserName().equals("admin")) {
            return mapping.findForward("loginSuccess");
        } else {
            return mapping.findForward("loginFail");
        }
    }
}
