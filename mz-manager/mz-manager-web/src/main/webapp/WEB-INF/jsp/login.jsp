<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>管理员登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="description" content="Expand, contract, animate forms with jQuery wihtout leaving the page" />
    <meta name="keywords" content="expand, form, css3, jquery, animate, width, height, adapt, unobtrusive javascript"/>
    <link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script src="js/login/cufon-yui.js" type="text/javascript"></script>
    <script src="js/login/ChunkFive_400.font.js" type="text/javascript"></script>
    <script type="text/javascript">
        Cufon.replace('h1',{ textShadow: '1px 1px #fff'});
        Cufon.replace('h2',{ textShadow: '1px 1px #fff'});
        Cufon.replace('h3',{ textShadow: '1px 1px #000'});
        Cufon.replace('.back');
    </script>
</head>
<body>
<div class="wrapper">
    <div class="content">
        <div id="form_wrapper" class="form_wrapper" style="margin-top: 200px">
            <form class="login active" method="post" id="loginForm">
                <h3>Login</h3>
                <div>
                    <label>Username:</label>
                    <input type="text" name="username" id="username" value="">
                    <div style="margin-left: 30px"><span id="sp1" style="color: red"></span></div>
                </div>
                <div>
                    <label>Password: <a href="forgot_password.html" rel="forgot_password" class="forgot linkform">Forgot your password?</a></label>
                    <input type="password" name="password" id="pwd"/>
                    <div style="margin-left: 30px"><span id="sp2" style="color: red"></span></div>
                </div>
                <div class="bottom">
                    <div class="remember"><input type="checkbox" /><span>Keep me logged in</span></div>
                    <input type="submit" id="submit" value="Login"></input>
                    <%--<a href="register.html" rel="register" class="linkform">You don't have an account yet? Register here</a>--%>
                    <div class="clear"></div>
                </div>
            </form>
            <form class="forgot_password">
                <h3>Forgot Password</h3>
                <div>
                    <label>Username or Email:</label>
                    <input type="text" />
                    <span class="error">This is an error</span>
                </div>
                <div class="bottom">
                    <input type="submit" value="Send reminder"></input>
                    <a href="index.html" rel="login" class="linkform">Suddenly remebered? Log in here</a>
                    <a href="register.html" rel="register" class="linkform">You don't have an account? Register here</a>
                    <div class="clear"></div>
                </div>
            </form>
        </div>
        <div class="clear"></div>
    </div>
</div>


<!-- The JavaScript -->
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
    $("#submit").click(function (e) {
       var name = $("#username").val();
       var pwd = $("#pwd").val();
       var flag1=false;
       var flag2=false;
       if(name==''||name==null){
           $("#sp1").html("用户名不能为空");
       }else{
           $("#sp1").html("");
           flag1=true;
       }
       if(pwd==''||pwd==null){
            $("#sp2").html("密码不能为空");
        }else{
            $("#sp2").html("");
            flag2=true;
        }
        e.preventDefault();
        if(flag1&&flag2){
                $.post(
                    'login',
                    {
                        'username':name,
                        'password':pwd
                    },
                    function(data) {
                        if(data==null){
                            $("#sp2").html("用户名或密码错误")
                        }else{
                            window.location.href="index";
                        }
                    },
                    'json'
                );
            }


    });

    $(function() {
        //the form wrapper (includes all forms)
        var $form_wrapper	= $('#form_wrapper'),
            //the current form is the one with class active
            $currentForm	= $form_wrapper.children('form.active'),
            //the change form links
            $linkform		= $form_wrapper.find('.linkform');

        //get width and height of each form and store them for later
        $form_wrapper.children('form').each(function(i){
            var $theForm	= $(this);
            //solve the inline display none problem when using fadeIn fadeOut
            if(!$theForm.hasClass('active'))
                $theForm.hide();
            $theForm.data({
                width	: $theForm.width(),
                height	: $theForm.height()
            });
        });

        //set width and height of wrapper (same of current form)
        setWrapperWidth();

        /*
        clicking a link (change form event) in the form
        makes the current form hide.
        The wrapper animates its width and height to the
        width and height of the new current form.
        After the animation, the new form is shown
        */
        $linkform.bind('click',function(e){
            var $link	= $(this);
            var target	= $link.attr('rel');
            $currentForm.fadeOut(400,function(){
                //remove class active from current form
                $currentForm.removeClass('active');
                //new current form
                $currentForm= $form_wrapper.children('form.'+target);
                //animate the wrapper
                $form_wrapper.stop()
                    .animate({
                        width	: $currentForm.data('width') + 'px',
                        height	: $currentForm.data('height') + 'px'
                    },500,function(){
                        //new form gets class active
                        $currentForm.addClass('active');
                        //show the new form
                        $currentForm.fadeIn(400);
                    });
            });
            e.preventDefault();
        });

        function setWrapperWidth(){
            $form_wrapper.css({
                width	: $currentForm.data('width') + 'px',
                height	: $currentForm.data('height') + 'px'
            });
        }

        /*
        for the demo we disabled the submit buttons
        if you submit the form, you need to check the
        which form was submited, and give the class active
        to the form you want to show
        */
        $form_wrapper.find('input[type="submit"]')
            .click(function(e){
                e.preventDefault();
            });
    });
</script>
</body>
</html>
