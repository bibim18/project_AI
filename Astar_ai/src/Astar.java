import java.util.*;

public class Astar{
        public static void main(String[] args){

                //initialize the graph base on the Romania map
                Node ��ا෾��ҹ�� = new Node ("��ا෾��ҹ��",355);
                Node ��ᾧྪ�	 = new Node ("��ᾧྪ�",48);
                Node ��¹ҷ	 = new Node ("��¹ҷ",16);
                Node ��ù�¡	 = new Node ("��ù�¡",47);
                Node ��û��	 = new Node ("��û��",15);
                Node ������ä�	 = new Node ("������ä�",22);
                Node �������	 = new Node ("�������",13);
                Node �����ҹ�	 = new Node ("�����ҹ�",11);
                Node ��й�������ظ��	 = new Node ("��й�������ظ��",48);
                Node �ԨԵ�	 = new Node ("�ԨԵ�",21);
                Node ��ɳ��š	 = new Node ("��ɳ��š	",36);
                Node ྪú�ó�	 = new Node ("ྪú�ó�	",22);
                Node ž����	 = new Node ("ž����",80);
                Node ��طû�ҡ��= new Node ("��طû�ҡ��",47);
                Node ��ط�ʧ����= new Node ("��ط�ʧ����",48);
                Node ��ط��Ҥ�	 = new Node ("��ط��Ҥ�",38);
                Node �ԧ�����	 = new Node ("�ԧ�����",25);
                Node ��⢷��	 = new Node ("��⢷��",48);
                Node �ؾ�ó����	 = new Node ("�ؾ�ó����",56);
                Node ��к���	 = new Node ("��к���",47);
                Node ��ҧ�ͧ	 = new Node ("��ҧ�ͧ",34);
                Node �ط�¸ҹ�	 = new Node ("�ط�¸ҹ�",32);
                
                Node �ҭ������	 = new Node ("�ҭ������",37);
                Node �ҡ	     = new Node ("�ҡ",31);
                Node ��ШǺ���բѹ��	 = new Node ("��ШǺ���բѹ��",58);
                Node ྪú���	 = new Node ("ྪú���",25);
                Node �Ҫ����	 = new Node ("�Ҫ����",53);
                
                Node �ѹ�����	 = new Node ("�ѹ�����",56);
                Node �ź���	 = new Node ("�ź���",45);
                Node ��Ҵ	 = new Node ("��Ҵ",78);
                Node ���ͧ	 = new Node ("���ͧ",98);
                Node ���ԧ���	 = new Node ("���ԧ���",65);
                Node ��Ҩչ����	 = new Node ("��Ҩչ����",101);
                Node ������	 = new Node ("������",34);
                
                Node ����Թ���	 = new Node ("����Թ���",45);
                Node �͹��	 = new Node ("�͹��",34);
                Node �������	 = new Node ("�������",23);
                Node ��þ��	 = new Node ("��þ��",47);
                Node ����Ҫ����  = new Node ("����Ҫ����",37);
                Node �֧���	 = new Node ("�֧���",8);
                Node ���������	 = new Node ("���������",21);
                Node �����ä��  = new Node ("�����ä��",9);
                Node �ء�����	 = new Node ("�ء�����",21);
                Node ��ʸ�	 = new Node ("��ʸ�",17);
                Node �������	 = new Node ("�������",14);
                Node ���	     = new Node ("���",13);
                Node ʡŹ��	 = new Node ("ʡŹ��",49);
                Node ���Թ���	 = new Node ("���Թ���",55);
                Node �������	 = new Node ("�������",11);
                Node ˹ͧ���	 = new Node ("˹ͧ���",67);
                Node ˹ͧ�������  = new Node ("˹ͧ�������",23);
                Node �شøҹ�	 = new Node ("�شøҹ�",33);
                Node �غ��Ҫ�ҹ�  = new Node ("�غ��Ҫ�ҹ�",27);
                Node �ӹҨ��ԭ  = new Node ("�ӹҨ��ԭ",44);

                Node ��§��� 	 = new Node ("��§���",31);
                Node ��§���� 	 = new Node ("��§����",26);
                Node ��ҹ 	 	 = new Node ("��ҹ",53);
                Node ����� 	 = new Node ("�����",21);
                Node ��� 	 	 = new Node ("���",25);
                Node �����ͧ�͹ 	 = new Node ("�����ͧ�͹",33);
                Node �ӻҧ 	 = new Node ("�ӻҧ",44);
                Node �Ӿٹ 	 = new Node ("�Ӿٹ",24);
                Node �صôԵ��	 = new Node ("�صôԵ��",68);

                Node ��к��	 = new Node ("��к��",49);
                Node �����	 = new Node ("�����",48);
                Node ��ѧ	 	 = new Node ("��ѧ",42);
                Node �����ո����Ҫ	 = new Node ("�����ո����Ҫ",96);
                Node ��Ҹ����	 = new Node ("��Ҹ����",11);
                Node �ѵ�ҹ�	 = new Node ("�ѵ�ҹ�",16);
                Node �ѧ��	     = new Node ("�ѧ��",21);
                Node �ѷ�ا	 = new Node ("�ѷ�ا",48);
                Node ���� 	 = new Node ("����",33);
                Node ����	     = new Node ("����",29);
                Node �йͧ	 = new Node ("�йͧ",14);
                Node ʧ���	 = new Node ("ʧ���",55);
                Node ʵ��	     = new Node ("ʵ��",55);
                Node ����ɮ��ҹ�  = new Node ("����ɮ��ҹ�",25);

                //initialize the edges
                	��ا෾��ҹ��.adjacencies = new Edge[]{
                        new Edge(��ط��Ҥ�,36),
                        new Edge(��طû�ҡ��,29),
                        new Edge(��û��,56),
                        new Edge(�������,20),          
                        new Edge(�����ҹ�,46),
                        new Edge(��ù�¡,107),
                        new Edge(���ԧ���,82)
                }; 
                 
                	��ᾧྪ� .adjacencies = new Edge[]{
                        new Edge(��⢷��,77),
                        new Edge(������ä�,117),
                        new Edge(�ԨԵ�,90),
                        new Edge(��ɳ��š,103),
                        new Edge(�ҡ,68)
                };
                 
                	��¹ҷ.adjacencies = new Edge[]{
                        new Edge(������ä�,64),
                        new Edge(�ط�¸ҹ�,42),
                        new Edge(�ԧ�����,53),
                        new Edge(�ؾ�ó����,294)
                };

                	��ù�¡.adjacencies = new Edge[]{
                        new Edge(��ا෾��ҹ��,107),
                        new Edge(�����ҹ�,101),
                        new Edge(��к���,58),
                        new Edge(��Ҩչ����,29),
                        new Edge(����Ҫ����,213)
                };
                 
                	��û��.adjacencies = new Edge[]{
                        new Edge(��ا෾��ҹ��,56),
                        new Edge(�������,76),  
                        new Edge(�ؾ�ó����,105),
                        new Edge(��ط��Ҥ�,48),
                        new Edge(�Ҫ����,41)
                };
                	
                	��طû�ҡ��.adjacencies = new Edge[]{
                            new Edge(��ا෾��ҹ��,29),
                            new Edge(�ź���,64)
                };
                	��ط�ʧ����.adjacencies = new Edge[]{
                            new Edge(��ط��Ҥ�,37),
                            new Edge(�Ҫ����,43),
                            new Edge(ྪú���,53)
                };
                	��Ҩչ����.adjacencies = new Edge[]{
                            new Edge(��ù�¡,29),
                            new Edge(���ԧ���,76),
                            new Edge(������,98),
                            new Edge(����Ҫ����,194)
                };
                	
                	������ä�.adjacencies = new Edge[]{
                            new Edge(��ᾧྪ�,117),
                            new Edge(�ԨԵ�,113),  
                            new Edge(ྪú�ó�,184),  
                            new Edge(ž����,103),  
                            new Edge(�ԧ�����,101),  
                            new Edge(��¹ҷ,64),  
                            new Edge(�ط�¸ҹ�,50),
                            new Edge(�ҡ,185)
                };
                	����Ҫ����.adjacencies = new Edge[]{
                            new Edge(�͹��,190),
                            new Edge(�������,119),  
                            new Edge(ž����,198),  
                            new Edge(��к���,152),  
                            new Edge(��ù�¡,213),  
                            new Edge(��Ҩչ����,194),  
                            new Edge(������,174),
                            new Edge(���������,124)
                };
                	�͹��.adjacencies = new Edge[]{
                            new Edge(���,206),
                            new Edge(�������,150),  
                            new Edge(˹ͧ�������,181),  
                            new Edge(����Ҫ����,190),  
                            new Edge(�����ä��,73),  
                            new Edge(����Թ���,77),  
                            new Edge(�شøҹ�,115),
                            new Edge(���������,200)
                };
                	��⢷��.adjacencies = new Edge[]{
                            new Edge(��ᾧྪ�,77),
                            new Edge(��ɳ��š,59),
                            new Edge(�ҡ,79)
                };
                	��ɳ��š.adjacencies = new Edge[]{
                            new Edge(��⢷��,59),
                            new Edge(�ԨԵ�,73),
                            new Edge(ྪú�ó�,129),
                            new Edge(���,269)
                };
                	���������.adjacencies = new Edge[]{
                            new Edge(����Ҫ����,124),
                            new Edge(�͹��,200),
                            new Edge(�����ä��,145),
                            new Edge(���Թ���,50)
                };
                	�������.adjacencies = new Edge[]{
                            new Edge(�͹��,150),
                            new Edge(ž����,243),
                            new Edge(ྪú�ó�,215),
                            new Edge(����Ҫ����,119)
                };
                	�ԨԵ�.adjacencies = new Edge[]{
                            new Edge(��ᾧྪ�,90),
                            new Edge(������ä�,113),
                            new Edge(��ɳ��š,73),
                            new Edge(ྪú�ó�,129)
                };
                	�صôԵ��.adjacencies = new Edge[]{
                            new Edge(��ҹ,191),
                            new Edge(���,74),
                            new Edge(��⢷��,100),
                            new Edge(��ɳ��š,118)
                };
                	ྪú�ó�.adjacencies = new Edge[]{
                            new Edge(��ɳ��š,170),
                            new Edge(�ԨԵ�,129),
                            new Edge(ž����,251),
                            new Edge(������ä�,184),
                            new Edge(���,190),
                            new Edge(�������,215)
                };
                	�شøҹ�.adjacencies = new Edge[]{
                            new Edge(˹ͧ���,51),
                            new Edge(ʡŹ��,159),
                            new Edge(����Թ���,192),
                            new Edge(�͹��,115),
                            new Edge(˹ͧ�������,46),
                            new Edge(���,152)
                };
                	ž����.adjacencies = new Edge[]{
                            new Edge(ྪú�ó�,251),
                            new Edge(��й�������ظ��,98),
                            new Edge(�ԧ�����,33),
                            new Edge(������ä�,103),
                            new Edge(��к���,46),
                            new Edge(�������,243),
                            new Edge(����Ҫ����,198)
                };
                	���ԧ���.adjacencies = new Edge[]{
                            new Edge(��ا෾��ҹ��,82),
                            new Edge(��Ҩչ����,76),
                            new Edge(������,245),
                            new Edge(�ѹ�����,228),
                            new Edge(�ź���,43)
                };
                	���.adjacencies = new Edge[]{
                            new Edge(��ɳ��š,269),
                            new Edge(ྪú�ó�,190),
                            new Edge(�͹��,206),
                            new Edge(˹ͧ�������,106),
                            new Edge(�شøҹ�,152),
                            new Edge(˹ͧ���,202)
                };
                	�ط�¸ҹ�.adjacencies = new Edge[]{
                            new Edge(��¹ҷ,42),
                            new Edge(�ؾ�ó����,319),
                            new Edge(������ä�,50),
                            new Edge(�ҡ,234)
                };
                	������.adjacencies = new Edge[]{
                            new Edge(��Ҩչ����,98),
                            new Edge(���ԧ���,245),
                            new Edge(�ѹ�����,258),
                            new Edge(����Ҫ����,174)
                };
                	��ҹ.adjacencies = new Edge[]{
                            new Edge(���,118),
                            new Edge(�����,176),
                            new Edge(�صôԵ��,191)
                };
                	˹ͧ���.adjacencies = new Edge[]{
                            new Edge(���,202),
                            new Edge(�֧���,113),
                            new Edge(�شøҹ�,51)
                };
                	˹ͧ�������.adjacencies = new Edge[]{
                            new Edge(���,106),
                            new Edge(�͹��,181),
                            new Edge(�شøҹ�,46)
                };
                	�֧���.adjacencies = new Edge[]{
                            new Edge(˹ͧ���,113),
                            new Edge(ʡŹ��,133),
                            new Edge(��þ��,182)
                };
                	�ź���.adjacencies = new Edge[]{
                            new Edge(��طû�ҡ��,64),
                            new Edge(���ԧ���,43),
                            new Edge(���ͧ,98),
                };
                	��þ��.adjacencies = new Edge[]{
                            new Edge(�֧���,182),
                            new Edge(ʡŹ��,93),
                            new Edge(�ء�����,104),
                };
                	�ѹ�����.adjacencies = new Edge[]{
                            new Edge(������,258),
                            new Edge(���ԧ���,228),
                            new Edge(���ͧ,110),
                            new Edge(��Ҵ,70)
                };
                	�����.adjacencies = new Edge[]{
                            new Edge(��§���,94),
                            new Edge(�ӻҧ,131),
                            new Edge(���,141),
                            new Edge(��ҹ,176)
                };
                	���ͧ.adjacencies = new Edge[]{
                            new Edge(�ź���,98),
                            new Edge(�ѹ�����,110)
                            
                };
                	��Ҵ.adjacencies = new Edge[]{
                            new Edge(�ѹ�����,70),                            
                };
                	
                	��ҧ�ͧ.adjacencies = new Edge[]{
                            new Edge(�ԧ�����,40),
                            new Edge(�ؾ�ó����,44),
                            new Edge(��й�������ظ��,31),
                };
                	�ԧ�����.adjacencies = new Edge[]{
                            new Edge(ž����,33),
                            new Edge(��¹ҷ,53),
                            new Edge(������ä�,101),
                            new Edge(��ҧ�ͧ,40)
                };
                	���Թ���.adjacencies = new Edge[]{
                            new Edge(�����ä��,177),
                            new Edge(���������,50),
                            new Edge(�������,105),
                            new Edge(�������,137)
                };
                	�������.adjacencies = new Edge[]{
                            new Edge(��ʸ�,159),
                            new Edge(�غ��Ҫ�ҹ�,61),
                            new Edge(���Թ���,105),
                            new Edge(�������,230)
                };
                	�غ��Ҫ�ҹ�.adjacencies = new Edge[]{
                            new Edge(��ʸ�,98),
                            new Edge(�������,61),
                            new Edge(�ӹҨ��ԭ,75)
                };
                	�ӹҨ��ԭ.adjacencies = new Edge[]{
                            new Edge(�ء�����,88),
                            new Edge(��ʸ�,54),
                            new Edge(�غ��Ҫ�ҹ�,75)
                };
                	�����ä��.adjacencies = new Edge[]{
                            new Edge(����Թ���,44),
                            new Edge(�͹��,73),
                            new Edge(���������,145),
                            new Edge(���Թ���,177),
                            new Edge(�������,40)
                };
                	��ʸ�.adjacencies = new Edge[]{
                            new Edge(�ء�����,166),
                            new Edge(�������,71),
                            new Edge(�������,159),
                            new Edge(�غ��Ҫ�ҹ�,98),
                            new Edge(�ӹҨ��ԭ,54)
                };
                	ʡŹ��.adjacencies = new Edge[]{
                            new Edge(�֧���,133),
                            new Edge(��þ��,93),
                            new Edge(�ء�����,119),
                            new Edge(����Թ���,128),
                            new Edge(�شøҹ�,159)
                };
                	���.adjacencies = new Edge[]{
	                        new Edge(�ӻҧ,109),
	                        new Edge(�����,141),
	                        new Edge(��ҹ,118),
	                        new Edge(�صôԵ��,74),
	                        new Edge(��⢷��,165)
                };
                	�������.adjacencies = new Edge[]{
                            new Edge(�����ä��,40),
                            new Edge(���Թ���,137),
                            new Edge(�������,230),
                            new Edge(����Թ���,47),
                            new Edge(��ʸ�,71)
                    };
                	�ء�����.adjacencies = new Edge[]{
                            new Edge(��þ��,104),
                            new Edge(ʡŹ��,119),
                            new Edge(��ʸ�,166),
                            new Edge(�ӹҨ��ԭ,88)
                    };
                	�ؾ�ó����.adjacencies = new Edge[]{
                            new Edge(��ҧ�ͧ,44),
                            new Edge(��й�������ظ��,176),
                            new Edge(��¹ҷ,294),          
                            new Edge(��û��,105),
                            new Edge(�ط�¸ҹ�,319),
                            new Edge(�Ҫ����,147),
                            new Edge(�ҭ������,91)
                    }; 
                	�ӻҧ.adjacencies = new Edge[]{
                            new Edge(��§���,225),
                            new Edge(��§����,92),
                            new Edge(�Ӿٹ,71),
                            new Edge(�ҡ,174),          
                            new Edge(��⢷��,207),
                            new Edge(���,109),
                            new Edge(�����,131)
                    }; 
                	��й�������ظ��.adjacencies = new Edge[]{
                            new Edge(�ؾ�ó����,176),
                            new Edge(��ҧ�ͧ,31),
                            new Edge(ž����,98),
                            new Edge(��к���,63),          
                            new Edge(�����ҹ�,122),
                            new Edge(�������,96)
                    }; 
                	��к���.adjacencies = new Edge[]{
                            new Edge(ž����,46),
                            new Edge(��й�������ظ��,63),
                            new Edge(��ù�¡,58),
                            new Edge(�����ҹ�,101),
                            new Edge(����Ҫ����,152)
                    }; 
                	����Թ���.adjacencies = new Edge[]{
                            new Edge(ʡŹ��,128),
                            new Edge(�شøҹ�,192),
                            new Edge(�͹��,77),
                            new Edge(�����ä��,44),
                            new Edge(�������,47)
                    }; 
                	�����ҹ�.adjacencies = new Edge[]{
                            new Edge(��к���,101),
                            new Edge(��й�������ظ��,122),
                            new Edge(��ù�¡,101),
                            new Edge(��ا෾��ҹ��,46),    
                            new Edge(�������,26) 
                    };
                	�������.adjacencies = new Edge[]{
                            new Edge(�����ҹ�,26),
                            new Edge(��й�������ظ��,96),
                            new Edge(��ط��Ҥ�,56),
                            new Edge(��ا෾��ҹ��,20),    
                            new Edge(��û��,76)  
                    };
                	��ط��Ҥ�.adjacencies = new Edge[]{
                            new Edge(��û��,48),
                            new Edge(�������,56),
                            new Edge(��ط�ʧ����,37),
                            new Edge(��ا෾��ҹ��,36),  
                            new Edge(�Ҫ����,78)
                    };
                	�ҭ������.adjacencies = new Edge[]{
                            new Edge(�ؾ�ó����,91),
                            new Edge(�Ҫ����,87),
                            new Edge(�ҡ,554)
                    };
                	�Ӿٹ.adjacencies = new Edge[]{
                            new Edge(��§����,21),
                            new Edge(�ӻҧ,71),
                            new Edge(�ҡ,224)
                    };
                	��§����.adjacencies = new Edge[]{
                            new Edge(�����ͧ�͹,349),
                            new Edge(�ҡ,265),
                            new Edge(�Ӿٹ,21),
                            new Edge(�ӻҧ,92),          
                            new Edge(��§���,182)
                    };
                	����ɮ��ҹ�.adjacencies = new Edge[]{
                            new Edge(�����,193),
                            new Edge(�йͧ,219),
                            new Edge(�ѧ��,196),
                            new Edge(��к��,211),          
                            new Edge(�����ո����Ҫ,134)
                    };
                	�ҡ.adjacencies = new Edge[]{
                            new Edge(��⢷��,79),
                            new Edge(��ᾧྪ�,68),
                            new Edge(������ä�,185),
                            new Edge(�ط�¸ҹ�,234),          
                            new Edge(�ҭ������,554),
                            new Edge(�����ͧ�͹,499),
                            new Edge(��§����,265),
                            new Edge(�Ӿٹ,224),
                            new Edge(�ӻҧ,174)      
                    };
                	�Ҫ����.adjacencies = new Edge[]{
                            new Edge(�ؾ�ó����,147),
                            new Edge(�ҭ������,87),
                            new Edge(��û��,41),
                            new Edge(��ط��Ҥ�,78),          
                            new Edge(��ط�ʧ����,43),
                            new Edge(ྪú���,54)
                    }; 
                	ྪú���.adjacencies = new Edge[]{
                            new Edge(�Ҫ����,54),
                            new Edge(��ط�ʧ����,53),
                            new Edge(��ШǺ���բѹ��,158)
                	};
                	��§���.adjacencies = new Edge[]{
                            new Edge(��§����,182),
                            new Edge(�ӻҧ,225),
                            new Edge(�����,94)
                	};
                	�����.adjacencies = new Edge[]{
                            new Edge(��ШǺ���բѹ��,183),
                            new Edge(�йͧ,117),
                            new Edge(����ɮ��ҹ�,193)
                	};
                	�йͧ.adjacencies = new Edge[]{
                            new Edge(�ѧ��,216),
                            new Edge(�����,117),
                            new Edge(����ɮ��ҹ�,219)
                	};
                	�����ո����Ҫ.adjacencies = new Edge[]{
                            new Edge(��к��,223),
                            new Edge(�ѷ�ا,99),
                            new Edge(����ɮ��ҹ�,134)
                	};
                	��ѧ.adjacencies = new Edge[]{
                            new Edge(��к��,131),
                            new Edge(�ѷ�ا,123),
                            new Edge(ʵ��,140)
                	};
                	ʵ��.adjacencies = new Edge[]{
                            new Edge(ʧ���,125),
                            new Edge(�ѷ�ا,134),
                            new Edge(��ѧ,140)
                	};
                	�ѵ�ҹ�.adjacencies = new Edge[]{
                            new Edge(ʧ���,99),
                            new Edge(����,35),
                            new Edge(��Ҹ����,92)
                	};
                	����.adjacencies = new Edge[]{
                			new Edge(ʧ���,128),
                            new Edge(�ѵ�ҹ�,35),
                            new Edge(��Ҹ����,128)
                	};
                	�ѧ��.adjacencies = new Edge[]{
                            new Edge(�йͧ,216),
                            new Edge(��к��,86),
                            new Edge(����ɮ��ҹ�,196),
                            new Edge(����,87)
                	};
                	��к��.adjacencies = new Edge[]{
                            new Edge(��ѧ,131),
                            new Edge(�����ո����Ҫ,223),
                            new Edge(����ɮ��ҹ�,211),
                            new Edge(�ѧ��,86)
                	};
                	�ѷ�ا.adjacencies = new Edge[]{
                            new Edge(��ѧ,123),
                            new Edge(�����ո����Ҫ,99),
                            new Edge(ʵ��,134),
                            new Edge(ʧ���,121)
                	};
                	ʧ���.adjacencies = new Edge[]{
                            new Edge(�ѷ�ا,121),
                            new Edge(ʵ��,125),
                            new Edge(����,128),
                            new Edge(�ѵ�ҹ�,99)
                	};
                	����.adjacencies = new Edge[]{
                            new Edge(�ѧ��,87)
                    };
                	��ШǺ���բѹ��.adjacencies = new Edge[]{
                            new Edge(ྪú���,158),
                            new Edge(�����,183),
                    };
                	��Ҹ����.adjacencies = new Edge[]{
                            new Edge(�ѵ�ҹ�,92),
                            new Edge(����,128),
                    };
                	�����ͧ�͹.adjacencies = new Edge[]{
                            new Edge(��§����,349),
                            new Edge(�ҡ,499)
                    };
                 
                Scanner s3 = new Scanner(System.in);
                System.out.print("Enter Province Start :");
                String str = s3.nextLine();
                Node str1 = new Node();
                if(str.equals("��ا෾��ҹ��")){str1 =��ا෾��ҹ��;}
                else if(str.equals("��ᾧྪ�")){str1 = ��ᾧྪ�;}
                else if(str.equals("��¹ҷ")){str1 = ��¹ҷ;}
                else if(str.equals("��ù�¡")){str1 = ��ù�¡;}
                else if(str.equals("��û��")){str1 = ��û��;}
                else if(str.equals("������� ��")){str1 = ������ä�	;}
                else if(str.equals("�������")){str1 = 	�������;}
                else if(str.equals("�����ҹ�")){str1 = �����ҹ�;}
                else if(str.equals("��й�������ظ��")){str1 = ��й�������ظ��	;}
                else if(str.equals("�ԨԵ�")){str1 = �ԨԵ�	;}
                else if(str.equals("��ɳ��š")){str1 = ��ɳ��š	;}
                else if(str.equals("ྪú�ó�")){str1 = ྪú�ó�	;}
                else if(str.equals("ž����")){str1 = ž����	;}
                else if(str.equals("��طû�ҡ��")){str1 = ��طû�ҡ��	;}
                else if(str.equals("��ط�ʧ����")){str1 = ��ط�ʧ����	;}
                else if(str.equals("��ط��Ҥ�")){str1 = ��ط��Ҥ�	;}
                else if(str.equals("�ԧ�����")){str1 = �ԧ�����	;}
                else if(str.equals("��⢷��")){str1 = ��⢷��	;}
                else if(str.equals("�ؾ�ó����")){str1 = �ؾ�ó����	;}
                else if(str.equals("��к���")){str1 = 	��к���	;}
                else if(str.equals("��ҧ�ͧ")){str1 = 	��ҧ�ͧ;}
                else if(str.equals("�ط�¸ҹ�")){str1 = 	�ط�¸ҹ�;}
                else if(str.equals("�ҭ������")){str1= �ҭ������	;}
                else if(str.equals("�ҡ")){str1= �ҡ	;}
                else if(str.equals("��ШǺ���բѹ��")){str1= ��ШǺ���բѹ��	;}
                else if(str.equals("ྪú���")){str1= ྪú���	;}
                else if(str.equals("�Ҫ����")){str1= �Ҫ����;}
                else if(str.equals("�ѹ�����")){str1= �ѹ�����;}
                else if(str.equals("�ź���")){str1= �ź���;}
                else if(str.equals("��Ҵ")){str1= ��Ҵ;}
                else if(str.equals("���ͧ")){str1= ���ͧ;}
                else if(str.equals("���ԧ���")){str1= ���ԧ���;}
                else if(str.equals("��Ҩչ����")){str1= ��Ҩչ����;}
                else if(str.equals("������")){str1= ������	;}
                else if(str.equals("��§���")){str1= ��§��� ;}
                else if(str.equals("��§����")){str1= ��§���� ;}
                else if(str.equals("��ҹ")){str1= ��ҹ ;}
                else if(str.equals("�����")){str1= ����� ;}
                else if(str.equals("���")){str1= ��� 	;}
                else if(str.equals("�����ͧ�͹")){str1= �����ͧ�͹ 	;}
                else if(str.equals("�ӻҧ")){str1= �ӻҧ ;}
                else if(str.equals("�Ӿٹ")){str1= �Ӿٹ ;}
                else if(str.equals("�صôԵ��")){str1= �صôԵ��;}
                else if(str.equals("��к��")){str1= ��к��	;}
                else if(str.equals("�����")){str1= �����	;}
                else if(str.equals("��ѧ")){str1= ��ѧ	;}
                else if(str.equals("�����ո����Ҫ")){str1= 	�����ո����Ҫ	;}
                else if(str.equals("��Ҹ����")){str1= 	��Ҹ����	;}
                else if(str.equals("�ѵ�ҹ�")){str1= �ѵ�ҹ�	;}
                else if(str.equals("�ѧ��")){str1= �ѧ��	;}
                else if(str.equals("�ѷ�ا")){str1= �ѷ�ا	;}
                else if(str.equals("���� ")){str1= ���� 	;}
                else if(str.equals("����")){str1= ����	;}
                else if(str.equals("�йͧ")){str1= �йͧ	;}
                else if(str.equals("ʧ���")){str1= ʧ���	;}
                else if(str.equals("ʵ��")){str1= ʵ��	;}
                else if(str.equals("����ɮ��ҹ�")){str1= ����ɮ��ҹ�	;}
                else {System.out.println("ERROR :: ����ժ��ͨѧ��Ѵ�鹷ҧ"); System.exit(0);}

                Scanner s2 = new Scanner(System.in);
                System.out.print("Enter Province Target :");
                String end = s2.nextLine();
                Node end1 = new Node();
                if(end.equals("��ا෾��ҹ��")){end1 = ��ا෾��ҹ��;}
                else if(end.equals("��ᾧྪ�")){end1= ��ᾧྪ�	;}
                else if(end.equals("��¹ҷ")){end1= ��¹ҷ	;}
                else if(end.equals("��ù�¡")){end1= 	��ù�¡	;}
                else if(end.equals("��û��")){end1= 	��û��	;}
                else if(end.equals("������ä�")){end1= ������ä�	;}
                else if(end.equals("�������")){end1= 	�������	;}
                else if(end.equals("�����ҹ�")){end1= 	�����ҹ�	;}
                else if(end.equals("��й�������ظ��")){end1= ��й�������ظ��	;}
                else if(end.equals("�ԨԵ�")){end1= �ԨԵ�	;}
                else if(end.equals("��ɳ��š")){end1= 	��ɳ��š	;}
                else if(end.equals("ྪú�ó�")){end1= 	ྪú�ó�	;}
                else if(end.equals("ž����")){end1= ž����	;}
                else if(end.equals("��طû�ҡ��")){end1=��طû�ҡ��	;}
                else if(end.equals("��ط�ʧ����")){end1= ��ط�ʧ����	;}
                else if(end.equals("��ط��Ҥ�")){end1= ��ط��Ҥ�	;}
                else if(end.equals("�ԧ�����")){end1= �ԧ�����	;}
                else if(end.equals("��⢷��")){end1= ��⢷��	;}
                else if(end.equals("�ؾ�ó����")){end1= �ؾ�ó����	;}
                else if(end.equals("��к���")){end1= ��к���;}
                else if(end.equals("��ҧ�ͧ")){end1=��ҧ�ͧ;}
                else if(end.equals("�ط�¸ҹ�")){end1= �ط�¸ҹ�	;}
                else if(end.equals("�ҭ������")){end1= �ҭ������	;}
                else if(end.equals("�ҡ")){end1= �ҡ	;}
                else if(end.equals("��ШǺ���բѹ��")){end1= ��ШǺ���բѹ��	;}
                else if(end.equals("ྪú���")){end1= ྪú���	;}
                else if(end.equals("�Ҫ����")){end1= �Ҫ����;}
                else if(end.equals("�ѹ�����")){end1= �ѹ�����;}
                else if(end.equals("�ź���")){end1= �ź���;}
                else if(end.equals("��Ҵ")){end1= ��Ҵ;}
                else if(end.equals("���ͧ")){end1= ���ͧ;}
                else if(end.equals("���ԧ���")){end1= ���ԧ���;}
                else if(end.equals("��Ҩչ����")){end1= 	��Ҩչ����;}
                else if(end.equals("������")){end1= 	������;}
                else if(end.equals("��§���")){end1= 	��§��� ;}
                else if(end.equals("��§����")){end1= 	��§���� ;}
                else if(end.equals("��ҹ")){end1= ��ҹ 	;}
                else if(end.equals("�����")){end1= ����� 	;}
                else if(end.equals("���")){end1= ��� 	;}
                else if(end.equals("�����ͧ�͹")){end1= �����ͧ�͹ ;}
                else if(end.equals("�ӻҧ")){end1= �ӻҧ ;}
                else if(end.equals("�Ӿٹ")){end1= �Ӿٹ ;}
                else if(end.equals("�صôԵ��")){end1= �صôԵ��;}
                else if(end.equals("��к��")){end1= ��к��;}
                else if(end.equals("�����")){end1= �����;}
                else if(end.equals("��ѧ")){end1= ��ѧ;}
                else if(end.equals("�����ո����Ҫ")){end1= 	�����ո����Ҫ;}
                else if(end.equals("��Ҹ����")){end1= 	��Ҹ����;}
                else if(end.equals("�ѵ�ҹ�")){end1= �ѵ�ҹ�;}
                else if(end.equals("�ѧ��")){end1= �ѧ��	;}
                else if(end.equals("�ѷ�ا")){end1= �ѷ�ا;}
                else if(end.equals("����")){end1= ���� ;}
                else if(end.equals("����")){end1= ����	;}
                else if(end.equals("�йͧ")){end1= �йͧ;}
                else if(end.equals("ʧ���")){end1= ʧ���;}
                else if(end.equals("ʵ��")){end1= ʵ��	;}
                else if(end.equals("����ɮ��ҹ�")){end1= ����ɮ��ҹ�	;}
                else {System.out.println("ERROR :: ����ժ��ͨѧ��Ѵ���·ҧ"); System.exit(0);}


               AstarSearch(str1,end1);

               
        }

        public static List<Node> printPath(Node target){
            List<Node> path = new ArrayList<Node>();
	    
		    for(Node node = target; node!=null; node = node.parent){
		        path.add(node); //���� node ����� path
		    }
		
		    Collections.reverse(path); //��Ѻ�ҡ��ѧ��˹��
		
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
                    Node current = queue.poll(); //�֧ ndoe ˹���ش� queue ���� current
                    explored.add(current);
                    
                    //�ͻ��·ҧ����
                    if(current.value.equals(goal.value)){
                            found = true;
                    }

                    //�礷ء child �ͧ  current node
                    for(Edge e : current.adjacencies){
                            Node child = e.target; //node ���������Ѻ current
                            double cost = e.cost; //��� ���зҧ�����ҧ�ѧ��Ѵ
                            double temp_g_scores = current.g_scores + cost; //priority
                            double temp_f_scores = temp_g_scores + child.h_scores; //h_scores ��� ��Ңͧ���� node ��ҹ������������Ҩ����͡�Թ��鹷ҧ�˹


                            /*��� child node ������� explored ��� f_score �ҡ���� child.f_scores �������
���������������������������� f_score ��������������*/
                            if((explored.contains(child)) && 
                                    (temp_f_scores >= child.f_scores)){
                                    continue;
                            }

                            /*��� child node �������� queue ���� 
                             f_score �դ�ҵ�ӡ���*/
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