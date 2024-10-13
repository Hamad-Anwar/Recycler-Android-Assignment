package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recycle)
        val adapter = SeriesAdaptor(getSeries())
        recyclerview.adapter=adapter
        val manager=GridLayoutManager(this, 2)
        recyclerview.layoutManager= manager
    }

  fun getSeries(): ArrayList<Series> {
      val series = ArrayList<Series>()

      series.add(Series("Diriliş: Ertuğrul",
          "Diriliş: Ertuğrul is an epic tale set in the 13th century, following the journey of Ertuğrul Bey, the father of Osman I, who would eventually go on to found the Ottoman Empire. The series delves into the rich cultural, political, and spiritual landscapes of the time, exploring themes of justice, loyalty, and leadership. Ertuğrul, a courageous and devout warrior, finds himself in constant conflict with crusaders, Mongols, and Byzantine forces, as well as political intrigue within his own ranks. Through his bravery and unwavering faith, Ertuğrul unites a fractured people and establishes the foundations for what will later become one of the most powerful empires in history. The show weaves intricate plots of romance, betrayal, family values, and friendship, capturing the audience with its deep emotional resonance and historically inspired storylines.",
          R.drawable.image1, "4.5", "2023-01-01"))

      series.add(Series("Kara Sevda",
          "Kara Sevda (Endless Love) tells the heart-wrenching love story between Kemal, a humble young man from a working-class family, and Nihan, a beautiful woman from an affluent background. The story begins with a chance encounter that sparks a powerful connection between the two, but societal pressures and personal sacrifices lead to their separation. As Kemal leaves town to build a successful career, Nihan is forced into a loveless marriage with a powerful businessman to protect her family. Years later, Kemal returns as a successful engineer, only to find that his love for Nihan has never faded. As they reconnect, they must navigate the complicated web of lies, deceit, and manipulation that surrounds them, battling external enemies and their own emotional scars. Kara Sevda explores themes of destiny, class division, and the undying nature of true love.",
          R.drawable.image2, "4.0", "2023-02-15"))

      series.add(Series("Çukur",
          "Çukur (The Pit) is an intense, action-packed drama set in a rough neighborhood of Istanbul controlled by the powerful Koçovalı family. The family has long kept criminal activities like drug trafficking out of their neighborhood, but the return of Yamaç, the youngest son, sets off a chain of events that threatens their control. Yamaç, who had distanced himself from his family to lead a quiet life, is drawn back into their world of crime, violence, and loyalty when his father is injured and the neighborhood is under attack by rival gangs. The show explores the deep connections between family, community, and power, as Yamaç struggles to protect his loved ones while navigating his moral compass. Alongside high-stakes action, Çukur also delves into complex emotional and personal dilemmas, making it not just a story of power and survival, but also of love, sacrifice, and redemption.",
          R.drawable.image3, "3.5", "2023-03-20"))

      series.add(Series("Muhteşem Yüzyıl",
          "Muhteşem Yüzyıl (The Magnificent Century) is a lavish historical drama centered around the life and reign of Sultan Suleiman the Magnificent, one of the most prominent leaders of the Ottoman Empire. The series explores the Sultan’s military conquests, his diplomatic strategies, and his personal life, particularly his complex relationships with the women in his harem, especially his love for Hurrem Sultan. Through intricate palace intrigues, power struggles, and deep emotional connections, the show paints a vivid picture of life in the Ottoman court, where politics and passion are intertwined. The grandeur of the empire, with its vast armies and cultural achievements, is juxtaposed with the personal sacrifices and moral dilemmas faced by Suleiman as he attempts to balance his duties as a ruler with his desires as a man. The series is both a celebration of Ottoman history and a deep exploration of power, love, and betrayal.",
          R.drawable.image4, "5.0", "2023-04-10"))

      series.add(Series("Aşk-ı Memnu",
          "Aşk-ı Memnu (Forbidden Love) is a poignant and tragic love story that unravels the secrets of a wealthy Istanbul family. The series follows the life of Bihter, a young woman who marries Adnan, a rich and much older man, to escape the controlling grip of her mother. However, her seemingly perfect life quickly spirals out of control when she falls in love with Behlül, Adnan’s handsome nephew, leading to a forbidden and dangerous affair. The clandestine romance disrupts the balance of the household and triggers a series of destructive events, causing emotional turmoil for everyone involved. Aşk-ı Memnu delves deeply into the psychological and emotional consequences of forbidden love, societal pressures, and family dynamics. It is a dramatic exploration of desire, guilt, and the devastating effects of deceit and betrayal, keeping viewers captivated as the characters’ lives unravel in tragic fashion.",
          R.drawable.image5, "4.2", "2023-05-05"))

      series.add(Series("Kurtlar Vadisi",
          "Kurtlar Vadisi (Valley of the Wolves) is an intense political thriller that delves into the dark underworld of Turkish politics and organized crime. The story follows Polat Alemdar, an undercover agent who infiltrates the criminal networks to uncover the deep-seated corruption and power struggles that shape the country's political landscape. As Polat moves deeper into the mafia world, he finds himself torn between his mission and his loyalty to the people he has come to care about. The show is known for its portrayal of real-world events, conspiracy theories, and the intersection of crime, politics, and nationalism. With its complex characters and intricate plotlines, Kurtlar Vadisi keeps viewers on edge as they navigate a world where allegiances shift and survival often comes at the cost of one's soul.",
          R.drawable.image1, "4.5", "2023-01-01"))

      series.add(Series("Medcezir",
          "Medcezir (The Tide) is a modern reimagining of the classic tale of Romeo and Juliet, set in contemporary Istanbul. The series follows the life of Yaman, a young man from a poor neighborhood who gets a second chance at life when he is taken in by a wealthy family. In his new world of privilege, Yaman meets and falls in love with Mira, a beautiful and rich girl. Despite the differences in their social backgrounds, they form a deep emotional connection that transcends the boundaries set by their families and society. However, their love is tested by jealousy, deceit, and the pressures of the elite world they inhabit. Medcezir explores themes of class disparity, love, ambition, and self-discovery, as Yaman and Mira navigate the complexities of their relationship while trying to stay true to themselves in a world that constantly seeks to change them.",
          R.drawable.image2, "4.0", "2023-02-15"))

      series.add(Series("Söz",
          "Söz (The Oath) is a high-stakes military drama that follows an elite squad of Turkish soldiers as they embark on dangerous missions to protect their country from terrorism and external threats. Led by Yavuz Karasu, a dedicated and fearless commander, the team faces brutal enemies, both at home and abroad, as they strive to uphold their honor and protect the innocent. Each episode delves into the personal lives of the soldiers, highlighting their courage, camaraderie, and the emotional toll of war. The show is a powerful exploration of sacrifice, loyalty, and patriotism, shedding light on the challenges faced by those who put their lives on the line to defend their nation. With gripping action sequences and emotionally charged moments, Söz keeps viewers on the edge of their seats.",
          R.drawable.image3, "3.5", "2023-03-20"))

      series.add(Series("Ezel",
          "Ezel is a gripping tale of betrayal, revenge, and redemption, revolving around Ömer Uçar, a man wrongfully imprisoned for a crime he didn’t commit. After being betrayed by his closest friends and the woman he loved, Ömer escapes prison and assumes a new identity, Ezel, to exact his revenge. The series unfolds through intricate flashbacks, slowly revealing the depth of the deception that led to Ömer’s downfall. As Ezel carefully plans his vengeance, he grapples with his remaining feelings for the people who wronged him and the ethical dilemmas that come with seeking retribution. The show masterfully blends psychological drama with action and suspense, creating a complex narrative that explores themes of trust, loyalty, and the cost of revenge.",
          R.drawable.image4, "5.0", "2023-04-10"))

      series.add(Series("Fatmagül'ün Suçu Ne?",
          "Fatmagül'ün Suçu Ne? (What is Fatmagül’s Fault?) is a powerful drama that tells the story of Fatmagül, a young woman from a small town whose life is shattered after she becomes the victim of a heinous crime. The series focuses on her emotional journey as she fights for justice against her wealthy attackers, who try to silence her with threats and bribes. Fatmagül, with the support of her family and a compassionate lawyer, refuses to give up, becoming a symbol of strength and resilience. The show tackles important social issues, such as gender-based violence, victim shaming, and the power dynamics between the rich and the poor, providing a stark look at the struggles faced by women in conservative societies. Through its heart-wrenching narrative, Fatmagül'ün Suçu Ne? sheds light on the importance of courage and perseverance in the face of injustice.",
          R.drawable.image5, "4.2", "2023-05-05"))

      return series;
  }

}