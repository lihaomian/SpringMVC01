<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table id="tb" border="1px" cellpadding="1px" cellspacing="0px" >
		<tr>
			<td colspan="3">
				<input type="button" id="add" value="addRow"  onclick="addRow()">
			</td>
		</tr>
		
	</table>
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
	//实现增加行
	function addRow(){
		//获取当前表格的行数 （注意这里的初始值为1，因为addRow按纽是第一行，而第一行数据的编号也应该为1）
		//#tb 通过表格的id获取表格对象 再通过父子关系中的tr 来定位到tr对象
		var tempRows = $("#tb tr").size();
		var name = "felix";
		//创建新的一行
		$tr = $("<tr></tr>");
		//创建新的一行的第一列，即第一个td，也就是行编号这个单元格(并设置id属性，为后面的删除操作中需要定位到具体哪一行做准备)
		$tdNum = $("<td id=\""+tempRows+"\"></td>");
		//text()方法为jquery对象的文本内容赋值。
		//第一次增加则第一行的编号为1，第二次增加的时候已经有两行了，所以tempRows的值为2，刚好第二行数据编号也应该为2
		$tdNum.text(tempRows);
		//创建第二列，即第二个td，也就是名字这个单元格
		$tdName = $("<td></td>");
		$tdName.text(name);
		//创建第三列，即第三个td，也就是删除按钮这个单元格
		$tdDelete = $("<td></td>");
		//创建删除按钮
		//在删除function中传入this关键字，即当前对象，也就是这一行的这一个删除按钮
		$deleteButton = $("<input type='button' value='deleteRow' onclick='deleteRow(this)'>");
		
		//将删除按钮添加到第三列，即第三个td(单元格)里面去
		$tdDelete.append($deleteButton);
		//依次将三个td对象(行编号、名字、删除按钮)添加到tr对象里面去
		$tr.append($tdNum);
		$tr.append($tdName);
		$tr.append($tdDelete);
		//最后将已经囊括了三个td对象的tr对象添加到表格里面去
		$("#tb").append($tr);
	}
	
	//a代表需要传递的参数
	function deleteRow(a){
		//删除行
		//通过传递过来的this关键字，即当前操作对象，定位到删除按钮，
		//再通过parent()定位到所在的td对象，进而再通过parent()定位到td对象所在的tr对象，最后将这个tr对象删除
		$(a).parent().parent().remove();
		//获取当前要删除的行的编号
		//parent()定位到td对象，两次prev()依次定位到第二个td和第一个td，
		//最终text()获取第一个td的数据，即行编号
		var rowNum = $(a).parent().prev().prev().text();
		alert(rowNum);
		//获取总行数
		//(注意是删除后的总行数，与下面for循环中的<=相对应，若在删除操作之前获取总行数，则在for循环应将结束循环的条件定义为i<temRows)
		var temRows = $("#tb tr").size();
		//i=parseInt(rowNum)+1    ： 从下一行(即被删除行的后面一行)开始逐行修改编号  
		//前面的行编号不动，但后面的编号需要减1
		//pareseInt方法将字符串数据变为int类型
		for(i=parseInt(rowNum)+1;i<=temRows;i++){
			//通过id选择器获取到具体的哪一行的第一列，并将第一列，即行编号这个单元格中的数据减1
			$("#"+i).text(i-1);
			//同时通过attr("属性名",属性值)方法将其id属性也减1
			$("#"+i).attr("id",i-1);
		}
	}
</script>
</body>

</html>