<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css">
</head>
<body>
          <form>
           <table>
                   <tr>
                     <td>驾驶证号码</td>
                     <td><input type="text" name="driver_num"></td>
                   </tr>
                   <tr>
                     <td>司机姓名</td>
                     <td><input type="text" name="name"></td>
                   </tr>
                   <tr>
                     <td>性别</td>
                     <td><input type="radio" name="sex" value="男">男
                         <input type="radio" name="sex" value="女">女
                    </td>
                   </tr>
                   <tr>
                     <td>地区</td>
                     <td><select name="pid" id="pid" onchange="toChange()">
                            <option value="">省</option>
                             <c:forEach items="${plist}" var="p">
                              <option value="${p.id }">${p.cityname }</option>                             
                             </c:forEach>
                         </select>
                         <select name="cid" id="cid" onchange="toChange2()">
                         <option value="">市</option>
                             
                         </select>
                         <select name="xid" id="xid">
                         <option value="">区</option>
                             
                         </select>
                    </td>
                   </tr>
                   <tr>
                     <td>发证日期</td>
                     <td><input type="date" name="issue_date"></td>
                   </tr>
                    <tr>
                     <td colspan="2"><input type="button" value="保存" onclick="save()"></td>
                   </tr>
           </table>
          </form>
          <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
          <script type="text/javascript">
         function toChange(){
        	$.get("city",{pid:$("#pid").val()},function(obj){
        		$("#cid").html("<option value=''>市</option>");
        		$("#xid").html("<option value=''>区</option>");
        		for(var i in obj){
        			$("#cid").append("<option value='"+obj[i].id+"'>"+obj[i].cityname+"</option>");
        	}
        	})
        }
        function toChange2(){
        	$.get("city",{pid:$("#cid").val()},function(obj){
        		$("#xid").html("<option value=''>区</option>");
        		for(var i in obj){
        			$("#xid").append("<option value='"+obj[i].id+"'>"+obj[i].cityname+"</option>");
        	}
        	})
        } 
        
        //保存添加数据
        function save(){
        	var data = $("form").serialize();
        	alert(data);
        	$.post("add",data,function(res){
        		if(res){
        			alert("添加成功");
        			location.href="driverManagerList";
        		}
        		else{
        			alert("添加失败");
        		}
        	})
        }
</script>
</body>
</html>