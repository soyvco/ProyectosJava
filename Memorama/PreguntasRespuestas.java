import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PreguntasRespuestas
{
   private GUIPreguntados m;
   private String      matrizPreguntas[][]  =new String[6][6];
   private String      bufferRespuestas[][] =new String[6][6];
   private String      matrizRespuestas[][] =new String[6][6];
   private ImageIcon   Iconos[]             =new ImageIcon[6];
   
   PreguntasRespuestas(JFrame j)
   {
      m=(GUIPreguntados)j;
   }
   
   public void crearPreguntas()
   {
      // Hongos
      matrizPreguntas[0][0]="¿Qué hongo es causante de la caspa y la Pitiriasis versicolor?"
            +"\nA) Malassezia globosa \nB) Malassezia furfur \nC) Malassezia nana";
      matrizPreguntas[1][0]="Son algunos factores de patogenicidad de Histoplasma Capsulatum:"
            +"\nA) Catalasa, Sideróforos, Gen URA5 \nB) Hemolisina, Fibrolisina, Gen URA5 \nC) Sideróforos, Coagulasa, Gen URA5";
      matrizPreguntas[2][0]="Candida Albicans forma parte de la microbiota en:"
            +"\nA) Cavidad Oral \nB) Vagina \nC) Todas las anteriores";
      matrizPreguntas[3][0]="Infección micótica adquirida por inoculación traumática\n"
            +"caracterizada por lesiones nodulares en la piel y tejido subcutáneo:"
            +"\nA) Cryptococcus Neoformans \nB) Sporothrix scheckii \nC) Madurella grisea";
      matrizPreguntas[4][0]="Aspergillus es causante de las siguientes enfermedades, excepto:"
            +"\nA) Aspergiloma Pulmonar \nB) Queratitis \nC) Mucormicosis";
      matrizPreguntas[5][0]="¿Cuales de las siguientes enfermedades es causada por Cryptococcus Neoformans?"
            +"\nA) Criptococosis Ósea \nB) Criptococosis Cutánea \nC) Todas las anteriores";
      // Parasitos
      matrizPreguntas[0][1]="¿Forma infectante de Entamoeba Histolytica?"
            +"\nA) Quiste\nB) Trofozoito\nC) Quiste inmaduro";
      matrizPreguntas[1][1]="¿Parasito qué puede llegara medir de 3 a 4 metros \n "
            +"cuyo escolex muestra ventosas y ganchos?"
            +"\nA) Taenia Saginata \nB) Taenia Solium \nC) Hymenolepis Nana ";
      matrizPreguntas[2][1]="Necator Americanus produce las siguientes enfermedades excepto:"
            +"\nA) Anemia Hipocrómica \nB) Síndrome de Loffler \nC)Apendicitis ";
      matrizPreguntas[3][1]="Parasitosis cosmopolita, causante de enfermedad diarreica aguda,\n"
            +" relacionada con Helicobacter Pylori:"
            +"\nA) Balantidium Coli \nB) Giardia Lamblia \nC) Entamoeba Hystolitica ";
      matrizPreguntas[4][1]="Son formas de transmisión de Ascaris Lumbricoide:"
            +"\nA) Geofagia \nB) Fecalismo \nC) Todas las anteriores ";
      matrizPreguntas[5][1]="Característica particular de Trichuris Trichuria:"
            +"\nA) Huevecillos en forma de balon de futbol \nB) Esofago musculoso y prominente \nC) Placas semilunares y capsula bucal larga ";
      // Bacterias
      matrizPreguntas[0][2]="Streptococcus Pyogenes del serogrupo A es causante de:"
            +"\nA) Escarlatina \nB) Meningitis \nC) Síndrome de piel escaldada";
      matrizPreguntas[1][2]="Staphylococcus aureus causa las siguientes enfermedades, excepto:"
            +"\nA) Síndrome de shock tóxico \nB) Osteomielitis \nC) Erisipela";
      matrizPreguntas[2][2]="La diarrea del viajero es causada por:"
            +"\nA) E. Coli Enteroinvasiva \nB) E. Coli Enteroagregativa \nC) E. Coli Enterotoxigénica";
      matrizPreguntas[3][2]="¿Cuáles de los siguientes son factores de patogenicidad de Helicobacter Pylori?"
            +"\nA) Hialorunidasa, mucinasa, y su forma helicoidal \nB) Ureasa, catalasa y su forma espiral \nC) Coagulasa, fibrolisina y su forma espiral";
      matrizPreguntas[4][2]="¿Cuál de las siguientes bacterias después de llegar a los órganos\n"
            +"del sistema reticuloendotelial, infecta, se multiplica y destruye a los macrófagos?"
            +"\nA) Salmonella typhi \nB) Proteus Mirabilis \nC) Brucella";
      matrizPreguntas[5][2]="Son características generales de Haemophilus Influenzae:"
            +"\nA) Cocobacilo grampositivo, móvil, proteínas NSP1 a NSP6 \nB) Cocobacilo gramnegativo, inmóvil, proteínas HMW1 y HMW2 \nC) Cocobacilo grampositivo, inmóvil, proteínas CMR197";
      // Virus
      matrizPreguntas[0][3]="Son características estructurales de Rotavirus:"
            +"\nA) Forma de rueda, virus desnudo, ARN bicatenario de 11 segmentos \nB) Forma de rueda, virus con envoltura, ARN monocatenario \nC) Forma de rueda, virus desnudo, ARN bicatenario 21 segmentos";
      matrizPreguntas[1][3]="¿Cuál de las siguientes Hepatitis no presenta cronicidad ni daño permanente sobre el hígado? "
            +"\nA) Hepatitis A \nB) Hepatitis B \nC) Hepatitis C";
      matrizPreguntas[2][3]="La Hepatitis B se transmite por: "
            +"\nA) Vía Sexual \nB) Vía Parenteral \nC) Todas las anteriores";
      matrizPreguntas[3][3]="¿Cuál de las siguientes Hepatitis a la larga puede causar cirrosis y cáncer de hígado?"
            +"\nA) Hepatitis A \nB) Hepatitis B \nC) Hepatitis C";
      matrizPreguntas[4][3]="¿Cuál de los siguientes virus es responsable del Herpes Labial y la Estomatitis herpética?"
            +"\nA) Citomegalovirus \nB) Herpes Zóster \nC) Herpes Simplex 1";
      matrizPreguntas[5][3]="La hemaglutinina y neuroaminidasa son factores de patogenicidad de:"
            +"\nA) Influenza \nB) Adenovirus \nC) Rinovirus";
   }
   
   public void crearRespuestas()
   {
      // Hongos
      matrizRespuestas[0][0]="B";
      matrizRespuestas[1][0]="A";
      matrizRespuestas[2][0]="C";
      matrizRespuestas[3][0]="B";
      matrizRespuestas[4][0]="C";
      matrizRespuestas[5][0]="C";
      // Parasitos
      matrizRespuestas[0][1]="A";
      matrizRespuestas[1][1]="B";
      matrizRespuestas[2][1]="C";
      matrizRespuestas[3][1]="B";
      matrizRespuestas[4][1]="C";
      matrizRespuestas[5][1]="A";
      // Bacterias
      matrizRespuestas[0][2]="A";
      matrizRespuestas[1][2]="C";
      matrizRespuestas[2][2]="C";
      matrizRespuestas[3][2]="B";
      matrizRespuestas[4][2]="A";
      matrizRespuestas[5][2]="B";
      // Virus
      matrizRespuestas[0][3]="A";
      matrizRespuestas[1][3]="A";
      matrizRespuestas[2][3]="C";
      matrizRespuestas[3][3]="C";
      matrizRespuestas[4][3]="C";
      matrizRespuestas[5][3]="A";
   }
   
   public void compararRespuestas(int i,int j)
   {
      for(int k=0; k<Iconos.length; k++)
      {
         Iconos[k]=new ImageIcon("img/"+k+".png");
      }
      bufferRespuestas[i][j]=JOptionPane.showInputDialog(matrizPreguntas[i][j]);
      if(bufferRespuestas[i][j].equalsIgnoreCase(matrizRespuestas[i][j]))
      {
         m.preguntas--;
         m.txtPreguntas.setText(m.preguntas.toString());
         if((i==0&&j==0)||(i==1&&j==0)||(i==2&&j==0)||(i==3&&j==0)||(i==4&&j==0)||(i==5&&j==0))
         {
            m.botones[i][j].setIcon(Iconos[1]);
            if((i==0&&j==0))
            {
               JOptionPane.showMessageDialog(null,"Malassezia furfur es una especie de hongo que forma\n"
                                                + "parte de la microbiota en la piel, es responsable de \n"
                                                + "la caspa y la pitariasis versicolor, conocida como tiña\n"
                                                + "la cual es consecuencia de una hiperqueratosis.","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/1.jpg"));
            }
            else if((i==1&&j==0))
            {
               JOptionPane.showMessageDialog(null,"Histoplasma Capsulatum modula el pH, produce catalasas \n"
                                                 +"y oxidasas que le confieren protección contra el \n"
                                                + "oxígeno reactivo del hospedero. Los sideróforos y \n"
                                                + "proteínas fijadoras de calcio le ayudan a la adquisición \n"
                                                + "de nutrientes.","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/2.png"));
            }
            else if((i==2&&j==0))
            {
               JOptionPane.showMessageDialog(null,"Candida Albicans forma parte de la microbiota normal \n"
                                                + "en la cavidad oral, tracto gastrointestinal y la \n"
                                                + "vagina. ","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/3.jpg"));
            }
            else if((i==3&&j==0))
            {
               JOptionPane.showMessageDialog(null,"La esporotricosis es una infección micótica de evolución \n"
                                                + "subaguda o crónica, adquirida por inoculación traumática o \n"
                                                + "inhalación de conidios. Presenta lesiones nodulares de "
                                                + "localización principal en la cara \n"
                                                + "y extremidades torácicas","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/4.jpg"));
            }
            else if((i==4&&j==0))
            {
               JOptionPane.showMessageDialog(null,"Aspergillus es causante de Aspergiloma Pulmonar, Otomicosis \n"
                                                + "Queratitis y Sinusitis.","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/5.jpg"));
            }
            else if((i==5&&j==0))
            {
               JOptionPane.showMessageDialog(null,"Cryptococcus neoformans es causante de la Criptococosis \n"
                                                + "pulmonar, ósea, cutánea, visceral, y del SNC. Las \n"
                                                + "manifestaciones más severas de micosis están asociadas \n"
                                                + "al estado inmune del paciente","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("hongos/6.jpg"));
            }
         }
         else if((i==0&&j==1)||(i==1&&j==1)||(i==2&&j==1)||(i==3&&j==1)||(i==4&&j==1)||(i==5&&j==1))
         {
            m.botones[i][j].setIcon(Iconos[0]);
            if((i==0&&j==1))
            {
               JOptionPane.showMessageDialog(null,"La forma infectante de Entamoeba Histolytica corresponde \n"
                                                + "al quiste maduro, el cual resiste al pH del estómago y \n"
                                                + "también resiste altas temperaturas en el ambiente. ","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/1.jpg"));
            }
            else if((i==1&&j==1))
            {
               JOptionPane.showMessageDialog(null,"Taenia Solium puede llegar a medir de 2 a 12 m, se aloja en \n"
                                                + "la pared del intestino delgado, principalmente en el yeyuno, \n"
                                                + "al que se adhiere por el escólex que posee 4 ventosas y un \n"
                                                + "róstelo armado con una corona de ganchos","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/2.jpg"));
            }
            else if((i==2&&j==1))
            {
               JOptionPane.showMessageDialog(null,"Necator Americanus posee factores de patogenicidad como sus \n"
                                                + "lancetas bucales y esófago musculoso, con el cual succiona y \n"
                                                + "así llega a causar anemia, entre otras enfermedades consecuentes \n"
                                                + "de su paso por ciclo biológico como es la dermatitis cutánea, \n"
                                                + "el síndrome de Loeffler y necatoriasis gastrointestinal","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/3.jpg"));
            }
            else if((i==3&&j==1))
            {
               JOptionPane.showMessageDialog(null,"Giardia Lamblia es causante de enfermedad diarréica aguda y \n"
                                                + "estudios recientes han demostrado que las infecciones con este \n"
                                                + "parásito estan en relación significativa con Helicobacter Pylori","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/4.jpg"));
            }
            else if((i==4&&j==1))
            {
               JOptionPane.showMessageDialog(null,"Ascaris Lumbricoide se puede transmitir vía fecal oral, por \n"
                                                + "geofagia, por alimentos y agua contaminados, siendo la \n"
                                                + "geohelmintiasis intestinal más frecuente del mundo.","Respuesta Correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/5.jpeg"));
            }
            else if((i==5&&j==1))
            {
               JOptionPane.showMessageDialog(null,"Una característica particular de Trichuris Trichuria es que sus \n"
                                                + "huevecillos tienen forma de balón de fútbol americano que posee \n"
                                                + "dos mamelones gelatinosos en sus extremos, lo que los hace fácilmente \n"
                                                + "identificables.","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("parasitos/6.jpg"));
            }
         }
         else if((i==0&&j==2)||(i==1&&j==2)||(i==2&&j==2)||(i==3&&j==2)||(i==4&&j==2)||(i==5&&j==2))
         {
            m.botones[i][j].setIcon(Iconos[2]);
            if((i==0&&j==2))
            {
               JOptionPane.showMessageDialog(null,"Streptococcus Pyogenes del serogrupo A es una bacteria grampositiva \n"
                                                + "que origina diversas enfermedades supurativas y no supurativas. Entre \n"
                                                + "ellas se encuentran la faringitis, escarlatina, erisipela, fascitis \n"
                                                + "necrosante, síndrome de shock tóxico y otras no supurativas como la \n"
                                                + "fiebre reumática y glomerulonefritis aguda. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/1.jpg"));
            }
            else if((i==1&&j==2))
            {
               JOptionPane.showMessageDialog(null,"Staphylococcus aureus es una bacteria productora de coagulasa y catalasas \n"
                                                + "que puede producir una alta gama de enfermedades como el Síndrome de piel \n"
                                                + "escaldada, intoxicación alimentaria, síndrome de shock tóxico e \n"
                                                + "infecciones supurativas como abcesos, impétigo, foliculitis \n"
                                                + "celulitis, osteomielitis, artritis séptica, entre otras. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/2.jpg"));
            }
            else if((i==2&&j==2))
            {
               JOptionPane.showMessageDialog(null,"E. coli enterotoxigénica es la responsable de la diarrea \n"
                                                + "del viajero, generalmente por consumo de alimentos \n"
                                                + "contaminados o agua contaminada por heces","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/3.jpg"));
            }
            else if((i==3&&j==2))
            {
               JOptionPane.showMessageDialog(null,"Helicobacter Pylori posee factores de patogenicidad como \n"
                                                + "lo son la ureasa, la cual convierte la urea en amoniaco, \n"
                                                + "lo cual le ayuda a subsistir en el pH del \n"
                                                + "estómago, también las catalasas \n"
                                                + "mucinasas y su forma espiral de ayudan a \n"
                                                + "infectar el epitelio gástrico. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/4.jpg"));
            }
            else if((i==4&&j==2))
            {
               JOptionPane.showMessageDialog(null,"Salmonella typhi llega a los órganos del sistema \n"
                                                + "reticuloendotelial infectando, multiplicándose y \n"
                                                + "destruyendo a los macrófagos, pasando de nuevo a la \n"
                                                + "circulación, dando lugar a una segunda bacteremia. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/5.jpg"));
            }
            else if((i==5&&j==2))
            {
               JOptionPane.showMessageDialog(null,"Haemophilus Influenzae es un cocobacilo gramnegativo, \n"
                                                + "inmóvil, que cuenta con proteínas de superficie \n"
                                                + "HMW1 y HMW2 ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("bacteria/6.jpg"));
            }
         }
         else if((i==0&&j==3)||(i==1&&j==3)||(i==2&&j==3)||(i==3&&j==3)||(i==4&&j==3)||(i==5&&j==3))
         {
            m.botones[i][j].setIcon(Iconos[3]);
            if((i==0&&j==3))
            {
               JOptionPane.showMessageDialog(null,"Rotavirus posee forma de rueda, es un virus desnudo \n"
                                                + "que tiene 3 capas, y un ARN bicatenario de 11 segmentos \n"
                                                + "y posee 12 proteínas: 6 estructurales (VP1 a VP6) y \n"
                                                + "6 no estructurales (NSP1 a NSP6)","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/1.jpe"));
            }
            else if((i==1&&j==3))
            {
               JOptionPane.showMessageDialog(null,"La hepatitis A es la única hepatitis que no presenta \n"
                                                + "cronicidad ni daño permanente sobre el hígado, su \n"
                                                + "periodo de incubación es de 15 a 45 días y su cuadro clínico \n"
                                                + "comienza con la aparición de fiebre, anorexia, nauseas, \n"
                                                + "dolor en el cuadrante abdominal superior derecho e ictericia. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/2.jpg"));
            }
            else if((i==2&&j==3))
            {
               JOptionPane.showMessageDialog(null,"Las formas de transmisión de la Hepatitis B son por \n"
                                                + "vía fecal oral, vía sexual y vía parenteral. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/3.jpg"));
            }
            else if((i==3&&j==3))
            {
               JOptionPane.showMessageDialog(null,"La Hepatitis C es causante de lesiones en el hígado que \n"
                                                + "a la larga pueden originar cirrosis, insuficiencia \n"
                                                + "hepática, cáncer de hígado y várices esofágicas. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/4.jpg"));
            }
            else if((i==4&&j==3))
            {
               JOptionPane.showMessageDialog(null,"El Virus del Herpes Simplex 1 causa Estomatitis Herpética \n"
                                                + "como infección primaria y el Herpes Labial como infección"
                                                + "recurrente. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/5.jpg"));
            }
            else if((i==5&&j==3))
            {
               JOptionPane.showMessageDialog(null,"La Hemaglutinina y la Neuroaminidasa son factores de \n"
                                                + "patogenicidad de la Influenza. La primera se enlaza a \n"
                                                + "glicoproteínas que contienen residuos de ácido siálico \n"
                                                + "y la neuroaminidasa degrada el ácido siálico de las \n"
                                                + "glicoproteínas usados como receptores para la infección. ","Respuesta correcta",JOptionPane.PLAIN_MESSAGE,new ImageIcon("virus/6.jpe"));
            }
         }
         m.botones[i][j].setText("");
      }
      else
      {
         JOptionPane.showMessageDialog(null,"Respuesta incorrecta. Intenta nuevamente.");
         m.botones[i][j].setText("");
         m.botones[i][j].setBackground(null);
         m.botones[i][j].setIcon(null);
      }
      if(m.preguntas==0)
      {
         m.ganar();
      }
   }
}
