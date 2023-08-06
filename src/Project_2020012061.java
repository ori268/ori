import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

// 인터넷 쇼핑 판매자 (입력, 삭제, 목록 조회, +a)
public class Project_2020012061 {
	
	public static void main(String[] args) {
		
		ArrayList Help_2020012061List = new ArrayList<>(); // import java.util.ArrayList;
	
		while(true) { // 무한 ROOP 시작.
			
			String menu = JOptionPane.showInputDialog(null,	"메뉴(인터넷 쇼핑 판매자)\n0:종료,  1:상품 입력,  2:상품 제거, 3 :상품 목록 조회,  4:상품 검색");
		//  종료, 입력, 삭제, 목록, 검색.
		
			if(menu == null) { // 잘못된 값 입력시.
				JOptionPane.showMessageDialog(null, "취소를 누르시면 안됩니다.");
				continue;
				
			}else if(menu.equals("0")){	// 0 : 종료.
				JOptionPane.showMessageDialog(null, "종료되었습니다!");
				System.exit(0);		
			
			}else if(menu.equals("1")) { // 1 : 입력. 
				// 입력 1, 2, 3의 값들이 Help_2020012061List 저장됨.
				
				String type = JOptionPane.showInputDialog(null,	"종류\n0:이전,  1:의류,  2:문구,  3:전자기기");
				if(type == null) { // 잘못된 값 입력시.
					JOptionPane.showMessageDialog(null, "취소를 누르시면 안됩니다.");
					continue;
				
				}else if(type.equals("0")) {
					continue;
				}else if(type.equals("1")) { // 의류에 대한 값 저장
					String name = JOptionPane.showInputDialog(null, "상품의 이름을 입력해주세요!");
					String price = JOptionPane.showInputDialog(null, "가격을 적어주세요!");

					int priceInt = 0;
					try {
						priceInt = Integer.parseInt(price);
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "숫자를 입력하세요!!");
						continue;
					}
					Help_2020012061 tmpHelp_2020012061 = new Help_2020012061();
					tmpHelp_2020012061.setName(name);
					tmpHelp_2020012061.setPrice(priceInt);
					Help_2020012061List.add(tmpHelp_2020012061);
				
					
				}else if(type.equals("2")) { // 문구류에 대한 값 저장
					String name = JOptionPane.showInputDialog(null, "상품의 이름을 입력해주세요!");
					String price = JOptionPane.showInputDialog(null, "가격을 적어주세요!");
				
					int priceInt = 0;
					try {
						priceInt = Integer.parseInt(price);
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "숫자를 입력하세요!!");
						continue;
					}
					Help_2020012061 tmpHelp_2020012061 = new Help_2020012061();
					tmpHelp_2020012061.setName(name);
					tmpHelp_2020012061.setPrice(priceInt);
					Help_2020012061List.add(tmpHelp_2020012061);
					
					
				}else if(type.equals("3")) { // 전자기기에 대한 값 저장
					String name = JOptionPane.showInputDialog(null, "상품의 이름을 입력해주세요!");
					String price = JOptionPane.showInputDialog(null, "가격을 적어주세요!");
				
					int priceInt = 0;
					try {
						priceInt = Integer.parseInt(price);
					}catch(NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "숫자를 입력하세요!!");
						continue;
					}
					Help_2020012061 tmpHelp_2020012061 = new Help_2020012061();
					tmpHelp_2020012061.setName(name);
					tmpHelp_2020012061.setPrice(priceInt);
					Help_2020012061List.add(tmpHelp_2020012061);
			
				}else { // 잘못된 값 입력시.
					JOptionPane.showMessageDialog(null, "보기에 적힌 값을 입력해주세요!!");
					continue;
				
				}
			}else if(menu.equals("2")){	// 2 : 삭제.
				
				Iterator it = Help_2020012061List.iterator();
				while(it.hasNext()) {
					Help_2020012061 tmp = (Help_2020012061) it.next();
					System.out.println(tmp.getName() + ": " + tmp.getPrice());
				} // 결과 출력으로 목록을 보기 (삭제할 때 목록을 보고 삭제 시키기 위해 작성)
				
				 String del = JOptionPane.showInputDialog(null, "삭제하고 싶은 상품의 이름을 입력해주세요!\n//※상품이 겹칠 경우 가장 먼저 입력한 상품이 삭제됩니다//.");

				 boolean found = false; 

				 Iterator<Help_2020012061> goods = Help_2020012061List.iterator();
				 while (goods.hasNext()) {
					 Help_2020012061 item = goods.next();
					 if (item.getName().equals(del)) { // 상품의 이름과 일치하는 경우 삭제 (item.getName()은 list에 저장된 값을 봄) (list의 저장된 값과 del에 입력에 된 값이 같다면 실행) 
						 goods.remove(); 
						 found = true; // 상품을 찾았다면 true 
						 break;
					 }
				 }

				 if (found == true) { // true라면 실행
					 JOptionPane.showMessageDialog(null, del + "이(가) 삭제되었습니다."); // 삭제하고 싶은 상품 삭제
				 } else { // false라면 실행
					 JOptionPane.showMessageDialog(null, "해당 상품을 찾을 수 없습니다."); // 보기에 없는 상품을 입력시 실행
				 }
				    
				    
			}else if(menu.equals("3")){	// 3 : 목록 조회.
				
				Iterator it = Help_2020012061List.iterator();
				while(it.hasNext()) {
					Help_2020012061 tmp = (Help_2020012061) it.next();
					System.out.println(tmp.getName() + ", " + tmp.getPrice());
			
				} 
				
		
			}else if(menu.equals("4")){	// 4 : 검색.
				
				String search = JOptionPane.showInputDialog(null, "검색할 상품의 이름을 입력해주세요!");
				boolean find = false; // 검색된 상품을 찾았는지 확인

				// 리스트를 순회하면서 검색할 상품을 찾기
				Iterator<Help_2020012061> product = Help_2020012061List.iterator();
				while (product.hasNext()) {
					Help_2020012061 item = product.next();
					if (item.getName().equals(search)) { // 상품의 이름과 일치하는 경우 실행
						JOptionPane.showMessageDialog(null, "검색 결과:\n" + item.getName() + ": " + item.getPrice());
						find = true; // 상품을 찾았다면 true
					}
				}

				if (find == false) { // 상품이 목록에 없을 시 실행
					JOptionPane.showMessageDialog(null, "검색 결과: 해당 상품을 찾을 수 없습니다.");
				}
				continue;
				
			} else { // 잘못된 값 입력시.
				JOptionPane.showMessageDialog(null, "보기에 적힌 값을 입력해주세요!!");
				continue;
			}
			
		} // 무한 루프 종료	

	} // main함수 끝
	
} // class 종료
