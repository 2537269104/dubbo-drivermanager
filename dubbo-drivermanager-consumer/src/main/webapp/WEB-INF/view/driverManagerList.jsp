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
<input type="button" value="添加" onclick="add()">
<form action="driverManagerList">
<input type="hidden" name="pageNum" value="${pageNum}">
  司机姓名：<input type="text" name="name" value="${name }"> <input type="submit" value="确定">
</form>
             <table>
                <tr>
                   <td>id</td>
                   <td>驾驶证号码</td>
                   <td>司机姓名</td>
                   <td>性别</td>
                   <td>省</td>
                   <td>市</td>
                   <td>区</td>
                   <td>发证日期</td>
                   <td>违规条数</td>
                   <td>操作</td>
                </tr>
                <c:forEach items="${pageInfo.list }" var="d">
                  <tr>
                   <td>${d.id }</td>
                   <td>${d.driver_num }</td>
                   <td>${d.name }</td>
                   <td>${d.sex}</td>
                   <td>${d.pname }</td>
                   <td>${d.cname }</td>
                   <td>${d.xname }</td>
                   <td>${d.issue_date }</td>
                   <td><a href="break?id=${d.id }">${d.break_num }</a></td>
                   <td><input type="button" value="修改" onclick="update(${d.id })"></td>
                  </tr>
                </c:forEach>
                 <tr>
         <td scope="row" colspan="10">
         <button onclick="fenye(1)">首页</button>
          <button onclick="fenye(${pageInfo.prePage==0?1:pageInfo.prePage})">上一页</button>
          <button onclick="fenye(${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage})">下一页</button>
          <button onclick="fenye(${pageInfo.pages})">尾页</button> 
     </td>
    </tr>
             </table>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
function fenye(currentPages){
	    $("[name=pageNum]").val(currentPages);
	      $("form").submit();
}
        
         function add(){
        	 location.href="toAdd";
         }
         function update(id){
        	 location.href="update?id="+id;
         }
</script>

</body>

</html>