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
             <table>
                <tr>
                   <td>id</td>
                   <td>驾驶证号码</td>
                   <td>司机姓名</td>
                   <td>违规明细</td>
                   <td>罚款</td>
                   <td>扣分</td>
                   <td>违章时间</td>
                   <td>状态</td>
                </tr>
                <c:forEach items="${breakList }" var="d">
                  <tr>
                   <td>${d.id }</td>
                   <td>${d.driver_num }</td>
                   <td>${d.name }</td>
                   <td>${d.break_str}</td>
                   <td>${d.bread_money }</td>
                   <td>${d.deduct_marks }</td>
                   <td>${d.break_date }</td>
                   <td>${d.state==1?"已处理":"未处理" }</td>
                  </tr>
                </c:forEach>
             </table>

</body>
</html>