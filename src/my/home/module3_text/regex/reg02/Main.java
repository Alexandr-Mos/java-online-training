package my.home.module3_text.regex.reg02;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Дана строка, содержащая следующий текст (xml-документ):
<notes>
 	<note id = "1">
 		<to>Вася</to>
 		<from>Света</from>
 		<heading>Напоминание</heading>
 		<body>Позвони мне завтра!</body>
 	</note>
 	<note id = "2">
 		<to>Петя</to>
 		<from>Маша</from>
 		<heading>Важное напоминание</heading>
 		<body/>
 	</note>
</notes>
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип 
(открывающий тег, закрывающий тег, содержимое тега, тег без тела). 
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
*/

public class Main {

	public static void main(String[] args) {
		String xml = "<notes>\r\n" + 
					 " 	<note id = \"1\">\r\n" + 
					 " 		<to>Вася</to>\r\n" + 
					 " 		<from>Света</from>\r\n" + 
					 " 		<heading>Напоминание</heading>\r\n" + 
					 " 		<body>Позвони мне завтра!</body>\r\n" + 
					 " 	</note>\r\n" + 
					 " 	<note id = \"2\">\r\n" + 
					 " 		<to>Петя</to>\r\n" + 
					 " 		<from>Маша</from>\r\n" + 
					 " 		<heading>Важное напоминание</heading>\r\n" + 
					 " 		<body/>\r\n" +
					 " 	</note>\r\n" + 
				"</notes>";
		//Pattern pattern = Pattern.compile("(\\s*<)[a-zA-Z0-9]+(>\\s*)", Pattern.UNICODE_CASE);
		
		ArrayList<Node> root = new Main().buildNode(xml);
		
		System.out.println("!!!!!!!");
		System.out.println(root.get(0));
		System.out.println("!!!!!!!");
		
		
	}
	
	public int start;
	public int end;
	public ArrayList<Node> buildNode(String xml) {
		Pattern patternBegin = Pattern.compile("<[^<>/]+>", Pattern.UNICODE_CASE);
		Matcher matcherBegin = patternBegin.matcher(xml);
		Matcher matcherEnd;
		Matcher temp;
		ArrayList<Node> nodes = new ArrayList<Node>();
		
		while (matcherBegin.find(start)) {
			Node node = new Node();
			String[] tagBegin = matcherBegin.group().replaceAll("<|>","").split(" ", 2);
			start = matcherBegin.end();
			end = 0;
			matcherEnd = Pattern.compile("(</" + tagBegin[0] + ">)|(<" + tagBegin[0] + "/>)", Pattern.UNICODE_CASE)
					     .matcher(xml);
			
			
			node.setTag(tagBegin[0]);
			if (tagBegin.length > 1) {
				node.setAttribute(tagBegin[1]);
			}
			
			if (matcherEnd.find(start)) {
				end = matcherEnd.start();
			} else {
				System.out.println("Отсутствует закрывающий тег! " + tagBegin[0]);
				return null;
			}
			
			
			String value = xml.substring(start, end);
			temp = patternBegin.matcher(value);
			if (temp.find()) {
				node.setNodes(buildNode(xml));
				value = null;
			} else {
				node.setValue(value);
				
			}
			nodes.add(node);
		}
		return nodes;
	}
	
}
