import java.util.*;

public class Astar{
        public static void main(String[] args){

                //initialize the graph base on the Romania map
                Node กรุงเทพมหานคร = new Node ("กรุงเทพมหานคร",355);
                Node กำแพงเพชร	 = new Node ("กำแพงเพชร",48);
                Node ชัยนาท	 = new Node ("ชัยนาท",16);
                Node นครนายก	 = new Node ("นครนายก",47);
                Node นครปฐม	 = new Node ("นครปฐม",15);
                Node นครสวรรค์	 = new Node ("นครสวรรค์",22);
                Node นนทบุรี	 = new Node ("นนทบุรี",13);
                Node ปทุมธานี	 = new Node ("ปทุมธานี",11);
                Node พระนครศรีอยุธยา	 = new Node ("พระนครศรีอยุธยา",48);
                Node พิจิตร	 = new Node ("พิจิตร",21);
                Node พิษณุโลก	 = new Node ("พิษณุโลก	",36);
                Node เพชรบูรณ์	 = new Node ("เพชรบูรณ์	",22);
                Node ลพบุรี	 = new Node ("ลพบุรี",80);
                Node สมุทรปราการ= new Node ("สมุทรปราการ",47);
                Node สมุทรสงคราม= new Node ("สมุทรสงคราม",48);
                Node สมุทรสาคร	 = new Node ("สมุทรสาคร",38);
                Node สิงห์บุรี	 = new Node ("สิงห์บุรี",25);
                Node สุโขทัย	 = new Node ("สุโขทัย",48);
                Node สุพรรณบุรี	 = new Node ("สุพรรณบุรี",56);
                Node สระบุรี	 = new Node ("สระบุรี",47);
                Node อ่างทอง	 = new Node ("อ่างทอง",34);
                Node อุทัยธานี	 = new Node ("อุทัยธานี",32);
                
                Node กาญจนบุรี	 = new Node ("กาญจนบุรี",37);
                Node ตาก	     = new Node ("ตาก",31);
                Node ประจวบคีรีขันธ์	 = new Node ("ประจวบคีรีขันธ์",58);
                Node เพชรบุรี	 = new Node ("เพชรบุรี",25);
                Node ราชบุรี	 = new Node ("ราชบุรี",53);
                
                Node จันทบุรี	 = new Node ("จันทบุรี",56);
                Node ชลบุรี	 = new Node ("ชลบุรี",45);
                Node ตราด	 = new Node ("ตราด",78);
                Node ระยอง	 = new Node ("ระยอง",98);
                Node ฉะเชิงเทรา	 = new Node ("ฉะเชิงเทรา",65);
                Node ปราจีนบุรี	 = new Node ("ปราจีนบุรี",101);
                Node สระแก้ว	 = new Node ("สระแก้ว",34);
                
                Node กาฬสินธุ์	 = new Node ("กาฬสินธุ์",45);
                Node ขอนแก่น	 = new Node ("ขอนแก่น",34);
                Node ชัยภูมิ	 = new Node ("ชัยภูมิ",23);
                Node นครพนม	 = new Node ("นครพนม",47);
                Node นครราชสีมา  = new Node ("นครราชสีมา",37);
                Node บึงกาฬ	 = new Node ("บึงกาฬ",8);
                Node บุรีรัมย์	 = new Node ("บุรีรัมย์",21);
                Node มหาสารคาม  = new Node ("มหาสารคาม",9);
                Node มุกดาหาร	 = new Node ("มุกดาหาร",21);
                Node ยโสธร	 = new Node ("ยโสธร",17);
                Node ร้อยเอ็ด	 = new Node ("ร้อยเอ็ด",14);
                Node เลย	     = new Node ("เลย",13);
                Node สกลนคร	 = new Node ("สกลนคร",49);
                Node สุรินทร์	 = new Node ("สุรินทร์",55);
                Node ศรีสะเกษ	 = new Node ("ศรีสะเกษ",11);
                Node หนองคาย	 = new Node ("หนองคาย",67);
                Node หนองบัวลำภู  = new Node ("หนองบัวลำภู",23);
                Node อุดรธานี	 = new Node ("อุดรธานี",33);
                Node อุบลราชธานี  = new Node ("อุบลราชธานี",27);
                Node อำนาจเจริญ  = new Node ("อำนาจเจริญ",44);

                Node เชียงราย 	 = new Node ("เชียงราย",31);
                Node เชียงใหม่ 	 = new Node ("เชียงใหม่",26);
                Node น่าน 	 	 = new Node ("น่าน",53);
                Node พะเยา 	 = new Node ("พะเยา",21);
                Node แพร่ 	 	 = new Node ("แพร่",25);
                Node แม่ฮ่องสอน 	 = new Node ("แม่ฮ่องสอน",33);
                Node ลำปาง 	 = new Node ("ลำปาง",44);
                Node ลำพูน 	 = new Node ("ลำพูน",24);
                Node อุตรดิตถ์	 = new Node ("อุตรดิตถ์",68);

                Node กระบี่	 = new Node ("กระบี่",49);
                Node ชุมพร	 = new Node ("ชุมพร",48);
                Node ตรัง	 	 = new Node ("ตรัง",42);
                Node นครศรีธรรมราช	 = new Node ("นครศรีธรรมราช",96);
                Node นราธิวาส	 = new Node ("นราธิวาส",11);
                Node ปัตตานี	 = new Node ("ปัตตานี",16);
                Node พังงา	     = new Node ("พังงา",21);
                Node พัทลุง	 = new Node ("พัทลุง",48);
                Node ภูเก็ต 	 = new Node ("ภูเก็ต",33);
                Node ยะลา	     = new Node ("ยะลา",29);
                Node ระนอง	 = new Node ("ระนอง",14);
                Node สงขลา	 = new Node ("สงขลา",55);
                Node สตูล	     = new Node ("สตูล",55);
                Node สุราษฎร์ธานี  = new Node ("สุราษฎร์ธานี",25);

                //initialize the edges
                	กรุงเทพมหานคร.adjacencies = new Edge[]{
                        new Edge(สมุทรสาคร,36),
                        new Edge(สมุทรปราการ,29),
                        new Edge(นครปฐม,56),
                        new Edge(นนทบุรี,20),          
                        new Edge(ปทุมธานี,46),
                        new Edge(นครนายก,107),
                        new Edge(ฉะเชิงเทรา,82)
                }; 
                 
                	กำแพงเพชร .adjacencies = new Edge[]{
                        new Edge(สุโขทัย,77),
                        new Edge(นครสวรรค์,117),
                        new Edge(พิจิตร,90),
                        new Edge(พิษณุโลก,103),
                        new Edge(ตาก,68)
                };
                 
                	ชัยนาท.adjacencies = new Edge[]{
                        new Edge(นครสวรรค์,64),
                        new Edge(อุทัยธานี,42),
                        new Edge(สิงห์บุรี,53),
                        new Edge(สุพรรณบุรี,294)
                };

                	นครนายก.adjacencies = new Edge[]{
                        new Edge(กรุงเทพมหานคร,107),
                        new Edge(ปทุมธานี,101),
                        new Edge(สระบุรี,58),
                        new Edge(ปราจีนบุรี,29),
                        new Edge(นครราชสีมา,213)
                };
                 
                	นครปฐม.adjacencies = new Edge[]{
                        new Edge(กรุงเทพมหานคร,56),
                        new Edge(นนทบุรี,76),  
                        new Edge(สุพรรณบุรี,105),
                        new Edge(สมุทรสาคร,48),
                        new Edge(ราชบุรี,41)
                };
                	
                	สมุทรปราการ.adjacencies = new Edge[]{
                            new Edge(กรุงเทพมหานคร,29),
                            new Edge(ชลบุรี,64)
                };
                	สมุทรสงคราม.adjacencies = new Edge[]{
                            new Edge(สมุทรสาคร,37),
                            new Edge(ราชบุรี,43),
                            new Edge(เพชรบุรี,53)
                };
                	ปราจีนบุรี.adjacencies = new Edge[]{
                            new Edge(นครนายก,29),
                            new Edge(ฉะเชิงเทรา,76),
                            new Edge(สระแก้ว,98),
                            new Edge(นครราชสีมา,194)
                };
                	
                	นครสวรรค์.adjacencies = new Edge[]{
                            new Edge(กำแพงเพชร,117),
                            new Edge(พิจิตร,113),  
                            new Edge(เพชรบูรณ์,184),  
                            new Edge(ลพบุรี,103),  
                            new Edge(สิงห์บุรี,101),  
                            new Edge(ชัยนาท,64),  
                            new Edge(อุทัยธานี,50),
                            new Edge(ตาก,185)
                };
                	นครราชสีมา.adjacencies = new Edge[]{
                            new Edge(ขอนแก่น,190),
                            new Edge(ชัยภูมิ,119),  
                            new Edge(ลพบุรี,198),  
                            new Edge(สระบุรี,152),  
                            new Edge(นครนายก,213),  
                            new Edge(ปราจีนบุรี,194),  
                            new Edge(สระแก้ว,174),
                            new Edge(บุรีรัมย์,124)
                };
                	ขอนแก่น.adjacencies = new Edge[]{
                            new Edge(เลย,206),
                            new Edge(ชัยภูมิ,150),  
                            new Edge(หนองบัวลำภู,181),  
                            new Edge(นครราชสีมา,190),  
                            new Edge(มหาสารคาม,73),  
                            new Edge(กาฬสินธุ์,77),  
                            new Edge(อุดรธานี,115),
                            new Edge(บุรีรัมย์,200)
                };
                	สุโขทัย.adjacencies = new Edge[]{
                            new Edge(กำแพงเพชร,77),
                            new Edge(พิษณุโลก,59),
                            new Edge(ตาก,79)
                };
                	พิษณุโลก.adjacencies = new Edge[]{
                            new Edge(สุโขทัย,59),
                            new Edge(พิจิตร,73),
                            new Edge(เพชรบูรณ์,129),
                            new Edge(เลย,269)
                };
                	บุรีรัมย์.adjacencies = new Edge[]{
                            new Edge(นครราชสีมา,124),
                            new Edge(ขอนแก่น,200),
                            new Edge(มหาสารคาม,145),
                            new Edge(สุรินทร์,50)
                };
                	ชัยภูมิ.adjacencies = new Edge[]{
                            new Edge(ขอนแก่น,150),
                            new Edge(ลพบุรี,243),
                            new Edge(เพชรบูรณ์,215),
                            new Edge(นครราชสีมา,119)
                };
                	พิจิตร.adjacencies = new Edge[]{
                            new Edge(กำแพงเพชร,90),
                            new Edge(นครสวรรค์,113),
                            new Edge(พิษณุโลก,73),
                            new Edge(เพชรบูรณ์,129)
                };
                	อุตรดิตถ์.adjacencies = new Edge[]{
                            new Edge(น่าน,191),
                            new Edge(แพร่,74),
                            new Edge(สุโขทัย,100),
                            new Edge(พิษณุโลก,118)
                };
                	เพชรบูรณ์.adjacencies = new Edge[]{
                            new Edge(พิษณุโลก,170),
                            new Edge(พิจิตร,129),
                            new Edge(ลพบุรี,251),
                            new Edge(นครสวรรค์,184),
                            new Edge(เลย,190),
                            new Edge(ชัยภูมิ,215)
                };
                	อุดรธานี.adjacencies = new Edge[]{
                            new Edge(หนองคาย,51),
                            new Edge(สกลนคร,159),
                            new Edge(กาฬสินธุ์,192),
                            new Edge(ขอนแก่น,115),
                            new Edge(หนองบัวลำภู,46),
                            new Edge(เลย,152)
                };
                	ลพบุรี.adjacencies = new Edge[]{
                            new Edge(เพชรบูรณ์,251),
                            new Edge(พระนครศรีอยุธยา,98),
                            new Edge(สิงห์บุรี,33),
                            new Edge(นครสวรรค์,103),
                            new Edge(สระบุรี,46),
                            new Edge(ชัยภูมิ,243),
                            new Edge(นครราชสีมา,198)
                };
                	ฉะเชิงเทรา.adjacencies = new Edge[]{
                            new Edge(กรุงเทพมหานคร,82),
                            new Edge(ปราจีนบุรี,76),
                            new Edge(สระแก้ว,245),
                            new Edge(จันทบุรี,228),
                            new Edge(ชลบุรี,43)
                };
                	เลย.adjacencies = new Edge[]{
                            new Edge(พิษณุโลก,269),
                            new Edge(เพชรบูรณ์,190),
                            new Edge(ขอนแก่น,206),
                            new Edge(หนองบัวลำภู,106),
                            new Edge(อุดรธานี,152),
                            new Edge(หนองคาย,202)
                };
                	อุทัยธานี.adjacencies = new Edge[]{
                            new Edge(ชัยนาท,42),
                            new Edge(สุพรรณบุรี,319),
                            new Edge(นครสวรรค์,50),
                            new Edge(ตาก,234)
                };
                	สระแก้ว.adjacencies = new Edge[]{
                            new Edge(ปราจีนบุรี,98),
                            new Edge(ฉะเชิงเทรา,245),
                            new Edge(จันทบุรี,258),
                            new Edge(นครราชสีมา,174)
                };
                	น่าน.adjacencies = new Edge[]{
                            new Edge(แพร่,118),
                            new Edge(พะเยา,176),
                            new Edge(อุตรดิตถ์,191)
                };
                	หนองคาย.adjacencies = new Edge[]{
                            new Edge(เลย,202),
                            new Edge(บึงกาฬ,113),
                            new Edge(อุดรธานี,51)
                };
                	หนองบัวลำภู.adjacencies = new Edge[]{
                            new Edge(เลย,106),
                            new Edge(ขอนแก่น,181),
                            new Edge(อุดรธานี,46)
                };
                	บึงกาฬ.adjacencies = new Edge[]{
                            new Edge(หนองคาย,113),
                            new Edge(สกลนคร,133),
                            new Edge(นครพนม,182)
                };
                	ชลบุรี.adjacencies = new Edge[]{
                            new Edge(สมุทรปราการ,64),
                            new Edge(ฉะเชิงเทรา,43),
                            new Edge(ระยอง,98),
                };
                	นครพนม.adjacencies = new Edge[]{
                            new Edge(บึงกาฬ,182),
                            new Edge(สกลนคร,93),
                            new Edge(มุกดาหาร,104),
                };
                	จันทบุรี.adjacencies = new Edge[]{
                            new Edge(สระแก้ว,258),
                            new Edge(ฉะเชิงเทรา,228),
                            new Edge(ระยอง,110),
                            new Edge(ตราด,70)
                };
                	พะเยา.adjacencies = new Edge[]{
                            new Edge(เชียงราย,94),
                            new Edge(ลำปาง,131),
                            new Edge(แพร่,141),
                            new Edge(น่าน,176)
                };
                	ระยอง.adjacencies = new Edge[]{
                            new Edge(ชลบุรี,98),
                            new Edge(จันทบุรี,110)
                            
                };
                	ตราด.adjacencies = new Edge[]{
                            new Edge(จันทบุรี,70),                            
                };
                	
                	อ่างทอง.adjacencies = new Edge[]{
                            new Edge(สิงห์บุรี,40),
                            new Edge(สุพรรณบุรี,44),
                            new Edge(พระนครศรีอยุธยา,31),
                };
                	สิงห์บุรี.adjacencies = new Edge[]{
                            new Edge(ลพบุรี,33),
                            new Edge(ชัยนาท,53),
                            new Edge(นครสวรรค์,101),
                            new Edge(อ่างทอง,40)
                };
                	สุรินทร์.adjacencies = new Edge[]{
                            new Edge(มหาสารคาม,177),
                            new Edge(บุรีรัมย์,50),
                            new Edge(ศรีสะเกษ,105),
                            new Edge(ร้อยเอ็ด,137)
                };
                	ศรีสะเกษ.adjacencies = new Edge[]{
                            new Edge(ยโสธร,159),
                            new Edge(อุบลราชธานี,61),
                            new Edge(สุรินทร์,105),
                            new Edge(ร้อยเอ็ด,230)
                };
                	อุบลราชธานี.adjacencies = new Edge[]{
                            new Edge(ยโสธร,98),
                            new Edge(ศรีสะเกษ,61),
                            new Edge(อำนาจเจริญ,75)
                };
                	อำนาจเจริญ.adjacencies = new Edge[]{
                            new Edge(มุกดาหาร,88),
                            new Edge(ยโสธร,54),
                            new Edge(อุบลราชธานี,75)
                };
                	มหาสารคาม.adjacencies = new Edge[]{
                            new Edge(กาฬสินธุ์,44),
                            new Edge(ขอนแก่น,73),
                            new Edge(บุรีรัมย์,145),
                            new Edge(สุรินทร์,177),
                            new Edge(ร้อยเอ็ด,40)
                };
                	ยโสธร.adjacencies = new Edge[]{
                            new Edge(มุกดาหาร,166),
                            new Edge(ร้อยเอ็ด,71),
                            new Edge(ศรีสะเกษ,159),
                            new Edge(อุบลราชธานี,98),
                            new Edge(อำนาจเจริญ,54)
                };
                	สกลนคร.adjacencies = new Edge[]{
                            new Edge(บึงกาฬ,133),
                            new Edge(นครพนม,93),
                            new Edge(มุกดาหาร,119),
                            new Edge(กาฬสินธุ์,128),
                            new Edge(อุดรธานี,159)
                };
                	แพร่.adjacencies = new Edge[]{
	                        new Edge(ลำปาง,109),
	                        new Edge(พะเยา,141),
	                        new Edge(น่าน,118),
	                        new Edge(อุตรดิตถ์,74),
	                        new Edge(สุโขทัย,165)
                };
                	ร้อยเอ็ด.adjacencies = new Edge[]{
                            new Edge(มหาสารคาม,40),
                            new Edge(สุรินทร์,137),
                            new Edge(ศรีสะเกษ,230),
                            new Edge(กาฬสินธุ์,47),
                            new Edge(ยโสธร,71)
                    };
                	มุกดาหาร.adjacencies = new Edge[]{
                            new Edge(นครพนม,104),
                            new Edge(สกลนคร,119),
                            new Edge(ยโสธร,166),
                            new Edge(อำนาจเจริญ,88)
                    };
                	สุพรรณบุรี.adjacencies = new Edge[]{
                            new Edge(อ่างทอง,44),
                            new Edge(พระนครศรีอยุธยา,176),
                            new Edge(ชัยนาท,294),          
                            new Edge(นครปฐม,105),
                            new Edge(อุทัยธานี,319),
                            new Edge(ราชบุรี,147),
                            new Edge(กาญจนบุรี,91)
                    }; 
                	ลำปาง.adjacencies = new Edge[]{
                            new Edge(เชียงราย,225),
                            new Edge(เชียงใหม่,92),
                            new Edge(ลำพูน,71),
                            new Edge(ตาก,174),          
                            new Edge(สุโขทัย,207),
                            new Edge(แพร่,109),
                            new Edge(พะเยา,131)
                    }; 
                	พระนครศรีอยุธยา.adjacencies = new Edge[]{
                            new Edge(สุพรรณบุรี,176),
                            new Edge(อ่างทอง,31),
                            new Edge(ลพบุรี,98),
                            new Edge(สระบุรี,63),          
                            new Edge(ปทุมธานี,122),
                            new Edge(นนทบุรี,96)
                    }; 
                	สระบุรี.adjacencies = new Edge[]{
                            new Edge(ลพบุรี,46),
                            new Edge(พระนครศรีอยุธยา,63),
                            new Edge(นครนายก,58),
                            new Edge(ปทุมธานี,101),
                            new Edge(นครราชสีมา,152)
                    }; 
                	กาฬสินธุ์.adjacencies = new Edge[]{
                            new Edge(สกลนคร,128),
                            new Edge(อุดรธานี,192),
                            new Edge(ขอนแก่น,77),
                            new Edge(มหาสารคาม,44),
                            new Edge(ร้อยเอ็ด,47)
                    }; 
                	ปทุมธานี.adjacencies = new Edge[]{
                            new Edge(สระบุรี,101),
                            new Edge(พระนครศรีอยุธยา,122),
                            new Edge(นครนายก,101),
                            new Edge(กรุงเทพมหานคร,46),    
                            new Edge(นนทบุรี,26) 
                    };
                	นนทบุรี.adjacencies = new Edge[]{
                            new Edge(ปทุมธานี,26),
                            new Edge(พระนครศรีอยุธยา,96),
                            new Edge(สมุทรสาคร,56),
                            new Edge(กรุงเทพมหานคร,20),    
                            new Edge(นครปฐม,76)  
                    };
                	สมุทรสาคร.adjacencies = new Edge[]{
                            new Edge(นครปฐม,48),
                            new Edge(นนทบุรี,56),
                            new Edge(สมุทรสงคราม,37),
                            new Edge(กรุงเทพมหานคร,36),  
                            new Edge(ราชบุรี,78)
                    };
                	กาญจนบุรี.adjacencies = new Edge[]{
                            new Edge(สุพรรณบุรี,91),
                            new Edge(ราชบุรี,87),
                            new Edge(ตาก,554)
                    };
                	ลำพูน.adjacencies = new Edge[]{
                            new Edge(เชียงใหม่,21),
                            new Edge(ลำปาง,71),
                            new Edge(ตาก,224)
                    };
                	เชียงใหม่.adjacencies = new Edge[]{
                            new Edge(แม่ฮ่องสอน,349),
                            new Edge(ตาก,265),
                            new Edge(ลำพูน,21),
                            new Edge(ลำปาง,92),          
                            new Edge(เชียงราย,182)
                    };
                	สุราษฎร์ธานี.adjacencies = new Edge[]{
                            new Edge(ชุมพร,193),
                            new Edge(ระนอง,219),
                            new Edge(พังงา,196),
                            new Edge(กระบี่,211),          
                            new Edge(นครศรีธรรมราช,134)
                    };
                	ตาก.adjacencies = new Edge[]{
                            new Edge(สุโขทัย,79),
                            new Edge(กำแพงเพชร,68),
                            new Edge(นครสวรรค์,185),
                            new Edge(อุทัยธานี,234),          
                            new Edge(กาญจนบุรี,554),
                            new Edge(แม่ฮ่องสอน,499),
                            new Edge(เชียงใหม่,265),
                            new Edge(ลำพูน,224),
                            new Edge(ลำปาง,174)      
                    };
                	ราชบุรี.adjacencies = new Edge[]{
                            new Edge(สุพรรณบุรี,147),
                            new Edge(กาญจนบุรี,87),
                            new Edge(นครปฐม,41),
                            new Edge(สมุทรสาคร,78),          
                            new Edge(สมุทรสงคราม,43),
                            new Edge(เพชรบุรี,54)
                    }; 
                	เพชรบุรี.adjacencies = new Edge[]{
                            new Edge(ราชบุรี,54),
                            new Edge(สมุทรสงคราม,53),
                            new Edge(ประจวบคีรีขันธ์,158)
                	};
                	เชียงราย.adjacencies = new Edge[]{
                            new Edge(เชียงใหม่,182),
                            new Edge(ลำปาง,225),
                            new Edge(พะเยา,94)
                	};
                	ชุมพร.adjacencies = new Edge[]{
                            new Edge(ประจวบคีรีขันธ์,183),
                            new Edge(ระนอง,117),
                            new Edge(สุราษฎร์ธานี,193)
                	};
                	ระนอง.adjacencies = new Edge[]{
                            new Edge(พังงา,216),
                            new Edge(ชุมพร,117),
                            new Edge(สุราษฎร์ธานี,219)
                	};
                	นครศรีธรรมราช.adjacencies = new Edge[]{
                            new Edge(กระบี่,223),
                            new Edge(พัทลุง,99),
                            new Edge(สุราษฎร์ธานี,134)
                	};
                	ตรัง.adjacencies = new Edge[]{
                            new Edge(กระบี่,131),
                            new Edge(พัทลุง,123),
                            new Edge(สตูล,140)
                	};
                	สตูล.adjacencies = new Edge[]{
                            new Edge(สงขลา,125),
                            new Edge(พัทลุง,134),
                            new Edge(ตรัง,140)
                	};
                	ปัตตานี.adjacencies = new Edge[]{
                            new Edge(สงขลา,99),
                            new Edge(ยะลา,35),
                            new Edge(นราธิวาส,92)
                	};
                	ยะลา.adjacencies = new Edge[]{
                			new Edge(สงขลา,128),
                            new Edge(ปัตตานี,35),
                            new Edge(นราธิวาส,128)
                	};
                	พังงา.adjacencies = new Edge[]{
                            new Edge(ระนอง,216),
                            new Edge(กระบี่,86),
                            new Edge(สุราษฎร์ธานี,196),
                            new Edge(ภูเก็ต,87)
                	};
                	กระบี่.adjacencies = new Edge[]{
                            new Edge(ตรัง,131),
                            new Edge(นครศรีธรรมราช,223),
                            new Edge(สุราษฎร์ธานี,211),
                            new Edge(พังงา,86)
                	};
                	พัทลุง.adjacencies = new Edge[]{
                            new Edge(ตรัง,123),
                            new Edge(นครศรีธรรมราช,99),
                            new Edge(สตูล,134),
                            new Edge(สงขลา,121)
                	};
                	สงขลา.adjacencies = new Edge[]{
                            new Edge(พัทลุง,121),
                            new Edge(สตูล,125),
                            new Edge(ยะลา,128),
                            new Edge(ปัตตานี,99)
                	};
                	ภูเก็ต.adjacencies = new Edge[]{
                            new Edge(พังงา,87)
                    };
                	ประจวบคีรีขันธ์.adjacencies = new Edge[]{
                            new Edge(เพชรบุรี,158),
                            new Edge(ชุมพร,183),
                    };
                	นราธิวาส.adjacencies = new Edge[]{
                            new Edge(ปัตตานี,92),
                            new Edge(ยะลา,128),
                    };
                	แม่ฮ่องสอน.adjacencies = new Edge[]{
                            new Edge(เชียงใหม่,349),
                            new Edge(ตาก,499)
                    };
                 
                Scanner s3 = new Scanner(System.in);
                System.out.print("Enter Province Start :");
                String str = s3.nextLine();
                Node str1 = new Node();
                if(str.equals("กรุงเทพมหานคร")){str1 =กรุงเทพมหานคร;}
                else if(str.equals("กำแพงเพชร")){str1 = กำแพงเพชร;}
                else if(str.equals("ชัยนาท")){str1 = ชัยนาท;}
                else if(str.equals("นครนายก")){str1 = นครนายก;}
                else if(str.equals("นครปฐม")){str1 = นครปฐม;}
                else if(str.equals("นครสวรร ค์")){str1 = นครสวรรค์	;}
                else if(str.equals("นนทบุรี")){str1 = 	นนทบุรี;}
                else if(str.equals("ปทุมธานี")){str1 = ปทุมธานี;}
                else if(str.equals("พระนครศรีอยุธยา")){str1 = พระนครศรีอยุธยา	;}
                else if(str.equals("พิจิตร")){str1 = พิจิตร	;}
                else if(str.equals("พิษณุโลก")){str1 = พิษณุโลก	;}
                else if(str.equals("เพชรบูรณ์")){str1 = เพชรบูรณ์	;}
                else if(str.equals("ลพบุรี")){str1 = ลพบุรี	;}
                else if(str.equals("สมุทรปราการ")){str1 = สมุทรปราการ	;}
                else if(str.equals("สมุทรสงคราม")){str1 = สมุทรสงคราม	;}
                else if(str.equals("สมุทรสาคร")){str1 = สมุทรสาคร	;}
                else if(str.equals("สิงห์บุรี")){str1 = สิงห์บุรี	;}
                else if(str.equals("สุโขทัย")){str1 = สุโขทัย	;}
                else if(str.equals("สุพรรณบุรี")){str1 = สุพรรณบุรี	;}
                else if(str.equals("สระบุรี")){str1 = 	สระบุรี	;}
                else if(str.equals("อ่างทอง")){str1 = 	อ่างทอง;}
                else if(str.equals("อุทัยธานี")){str1 = 	อุทัยธานี;}
                else if(str.equals("กาญจนบุรี")){str1= กาญจนบุรี	;}
                else if(str.equals("ตาก")){str1= ตาก	;}
                else if(str.equals("ประจวบคีรีขันธ์")){str1= ประจวบคีรีขันธ์	;}
                else if(str.equals("เพชรบุรี")){str1= เพชรบุรี	;}
                else if(str.equals("ราชบุรี")){str1= ราชบุรี;}
                else if(str.equals("จันทบุรี")){str1= จันทบุรี;}
                else if(str.equals("ชลบุรี")){str1= ชลบุรี;}
                else if(str.equals("ตราด")){str1= ตราด;}
                else if(str.equals("ระยอง")){str1= ระยอง;}
                else if(str.equals("ฉะเชิงเทรา")){str1= ฉะเชิงเทรา;}
                else if(str.equals("ปราจีนบุรี")){str1= ปราจีนบุรี;}
                else if(str.equals("สระแก้ว")){str1= สระแก้ว	;}
                else if(str.equals("เชียงราย")){str1= เชียงราย ;}
                else if(str.equals("เชียงใหม่")){str1= เชียงใหม่ ;}
                else if(str.equals("น่าน")){str1= น่าน ;}
                else if(str.equals("พะเยา")){str1= พะเยา ;}
                else if(str.equals("แพร่")){str1= แพร่ 	;}
                else if(str.equals("แม่ฮ่องสอน")){str1= แม่ฮ่องสอน 	;}
                else if(str.equals("ลำปาง")){str1= ลำปาง ;}
                else if(str.equals("ลำพูน")){str1= ลำพูน ;}
                else if(str.equals("อุตรดิตถ์")){str1= อุตรดิตถ์;}
                else if(str.equals("กระบี่")){str1= กระบี่	;}
                else if(str.equals("ชุมพร")){str1= ชุมพร	;}
                else if(str.equals("ตรัง")){str1= ตรัง	;}
                else if(str.equals("นครศรีธรรมราช")){str1= 	นครศรีธรรมราช	;}
                else if(str.equals("นราธิวาส")){str1= 	นราธิวาส	;}
                else if(str.equals("ปัตตานี")){str1= ปัตตานี	;}
                else if(str.equals("พังงา")){str1= พังงา	;}
                else if(str.equals("พัทลุง")){str1= พัทลุง	;}
                else if(str.equals("ภูเก็ต ")){str1= ภูเก็ต 	;}
                else if(str.equals("ยะลา")){str1= ยะลา	;}
                else if(str.equals("ระนอง")){str1= ระนอง	;}
                else if(str.equals("สงขลา")){str1= สงขลา	;}
                else if(str.equals("สตูล")){str1= สตูล	;}
                else if(str.equals("สุราษฎร์ธานี")){str1= สุราษฎร์ธานี	;}
                else {System.out.println("ERROR :: ไม่มีชื่อจังหวัดต้นทาง"); System.exit(0);}

                Scanner s2 = new Scanner(System.in);
                System.out.print("Enter Province Target :");
                String end = s2.nextLine();
                Node end1 = new Node();
                if(end.equals("กรุงเทพมหานคร")){end1 = กรุงเทพมหานคร;}
                else if(end.equals("กำแพงเพชร")){end1= กำแพงเพชร	;}
                else if(end.equals("ชัยนาท")){end1= ชัยนาท	;}
                else if(end.equals("นครนายก")){end1= 	นครนายก	;}
                else if(end.equals("นครปฐม")){end1= 	นครปฐม	;}
                else if(end.equals("นครสวรรค์")){end1= นครสวรรค์	;}
                else if(end.equals("นนทบุรี")){end1= 	นนทบุรี	;}
                else if(end.equals("ปทุมธานี")){end1= 	ปทุมธานี	;}
                else if(end.equals("พระนครศรีอยุธยา")){end1= พระนครศรีอยุธยา	;}
                else if(end.equals("พิจิตร")){end1= พิจิตร	;}
                else if(end.equals("พิษณุโลก")){end1= 	พิษณุโลก	;}
                else if(end.equals("เพชรบูรณ์")){end1= 	เพชรบูรณ์	;}
                else if(end.equals("ลพบุรี")){end1= ลพบุรี	;}
                else if(end.equals("สมุทรปราการ")){end1=สมุทรปราการ	;}
                else if(end.equals("สมุทรสงคราม")){end1= สมุทรสงคราม	;}
                else if(end.equals("สมุทรสาคร")){end1= สมุทรสาคร	;}
                else if(end.equals("สิงห์บุรี")){end1= สิงห์บุรี	;}
                else if(end.equals("สุโขทัย")){end1= สุโขทัย	;}
                else if(end.equals("สุพรรณบุรี")){end1= สุพรรณบุรี	;}
                else if(end.equals("สระบุรี")){end1= สระบุรี;}
                else if(end.equals("อ่างทอง")){end1=อ่างทอง;}
                else if(end.equals("อุทัยธานี")){end1= อุทัยธานี	;}
                else if(end.equals("กาญจนบุรี")){end1= กาญจนบุรี	;}
                else if(end.equals("ตาก")){end1= ตาก	;}
                else if(end.equals("ประจวบคีรีขันธ์")){end1= ประจวบคีรีขันธ์	;}
                else if(end.equals("เพชรบุรี")){end1= เพชรบุรี	;}
                else if(end.equals("ราชบุรี")){end1= ราชบุรี;}
                else if(end.equals("จันทบุรี")){end1= จันทบุรี;}
                else if(end.equals("ชลบุรี")){end1= ชลบุรี;}
                else if(end.equals("ตราด")){end1= ตราด;}
                else if(end.equals("ระยอง")){end1= ระยอง;}
                else if(end.equals("ฉะเชิงเทรา")){end1= ฉะเชิงเทรา;}
                else if(end.equals("ปราจีนบุรี")){end1= 	ปราจีนบุรี;}
                else if(end.equals("สระแก้ว")){end1= 	สระแก้ว;}
                else if(end.equals("เชียงราย")){end1= 	เชียงราย ;}
                else if(end.equals("เชียงใหม่")){end1= 	เชียงใหม่ ;}
                else if(end.equals("น่าน")){end1= น่าน 	;}
                else if(end.equals("พะเยา")){end1= พะเยา 	;}
                else if(end.equals("แพร่")){end1= แพร่ 	;}
                else if(end.equals("แม่ฮ่องสอน")){end1= แม่ฮ่องสอน ;}
                else if(end.equals("ลำปาง")){end1= ลำปาง ;}
                else if(end.equals("ลำพูน")){end1= ลำพูน ;}
                else if(end.equals("อุตรดิตถ์")){end1= อุตรดิตถ์;}
                else if(end.equals("กระบี่")){end1= กระบี่;}
                else if(end.equals("ชุมพร")){end1= ชุมพร;}
                else if(end.equals("ตรัง")){end1= ตรัง;}
                else if(end.equals("นครศรีธรรมราช")){end1= 	นครศรีธรรมราช;}
                else if(end.equals("นราธิวาส")){end1= 	นราธิวาส;}
                else if(end.equals("ปัตตานี")){end1= ปัตตานี;}
                else if(end.equals("พังงา")){end1= พังงา	;}
                else if(end.equals("พัทลุง")){end1= พัทลุง;}
                else if(end.equals("ภูเก็ต")){end1= ภูเก็ต ;}
                else if(end.equals("ยะลา")){end1= ยะลา	;}
                else if(end.equals("ระนอง")){end1= ระนอง;}
                else if(end.equals("สงขลา")){end1= สงขลา;}
                else if(end.equals("สตูล")){end1= สตูล	;}
                else if(end.equals("สุราษฎร์ธานี")){end1= สุราษฎร์ธานี	;}
                else {System.out.println("ERROR :: ไม่มีชื่อจังหวัดปลายทาง"); System.exit(0);}


               AstarSearch(str1,end1);

               
        }

        public static List<Node> printPath(Node target){
            List<Node> path = new ArrayList<Node>();
	    
		    for(Node node = target; node!=null; node = node.parent){
		        path.add(node); //เพิ่ม node เข้าไปใน path
		    }
		
		    Collections.reverse(path); //กลับจากหลังมาหน้า
		
		    return path;
	    }

    public static void AstarSearch(Node source, Node goal){

            Set<Node> explored = new HashSet<Node>();

            PriorityQueue<Node> queue = new PriorityQueue<Node>(20, 
                    new Comparator<Node>(){
                             //override compare method
             public int compare(Node i, Node j){
                if(i.f_scores > j.f_scores){
                    return 1;
                }

                else if (i.f_scores < j.f_scores){
                    return -1;
                }

                else{
                    return 0;
                }
             }

                    });

            //cost from start
            source.g_scores = 0;
            queue.add(source);
            boolean found = false;
            while((!queue.isEmpty())&&(!found)){
                    //the node in having the lowest f_score value
                    Node current = queue.poll(); //ดึง ndoe หน้าสุดใน queue มาเป็น current
                    explored.add(current);
                    
                    //เจอปลายทางแล้ว
                    if(current.value.equals(goal.value)){
                            found = true;
                    }

                    //เช็คทุก child ของ  current node
                    for(Edge e : current.adjacencies){
                            Node child = e.target; //node ที่เชื่อมกับ current
                            double cost = e.cost; //ค่า ระยะทางระหว่างจังหวัด
                            double temp_g_scores = current.g_scores + cost; //priority
                            double temp_f_scores = temp_g_scores + child.h_scores; //h_scores คือ ค่าของแต่ละ node ค่านี้เอาไว้เช็คว่าจะเลือกเดินเส้นทางไหน


                            /*ถ้า child node มีอยุ่ใน explored และ f_score มากกว่า child.f_scores ให้ข้ามไป
                             f_score ใหม่กว่าให้ข้ามไป*/
                            if((explored.contains(child)) && 
                                    (temp_f_scores >= child.f_scores)){
                                    continue;
                            }

                            /*ถ้า child node ไม่อยู่ใน queue หรือ 
                             f_score มีค่าต่ำกว่า*/
                            else if((!queue.contains(child)) || 
                                    (temp_f_scores < child.f_scores)){
                            	
                                    child.parent = current;
                                    child.g_scores = temp_g_scores;
                                    child.f_scores = temp_f_scores;

                                    if(queue.contains(child)){
                                            queue.remove(child);
                                    }

                                    queue.add(child);
                            }

                    }//end for

            }//end while
            List<Node> path = printPath(goal);

            System.out.println("Path: " + path);
    }
    
}

class Node{

    public final String value;
    public double g_scores;
    public final double h_scores;
    public double f_scores = 0;
    public Edge[] adjacencies;
    public Node parent;
    public Node(){
    	value = "";
        h_scores = 0;
    }
    public Node(String val, double hVal){
            value = val;
            h_scores = hVal;
    }

    public String toString(){
            return value;
    }

}

class Edge{
    public final double cost;
    public final Node target;

    public Edge(Node targetNode, double costVal){
            target = targetNode;
            cost = costVal;
    }
}