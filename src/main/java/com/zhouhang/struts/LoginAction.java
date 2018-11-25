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
        // 转换成LoginForm new-branch
        // 1.cast actionform into subclass of actionform
        LoginForm loginFrom = (LoginForm) form;

        // 2.business logic
        String returnUrl = "";
        if (loginFrom.getUserName().equals("admin")) {
            returnUrl = "loginSuccess";
        } else {
            returnUrl = "loginFail";
        }

        //3.return the forward by key word
        return mapping.findForward(returnUrl);

    }
}
