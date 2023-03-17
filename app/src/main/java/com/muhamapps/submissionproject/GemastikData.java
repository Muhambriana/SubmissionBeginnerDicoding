package com.muhamapps.submissionproject;

import java.util.ArrayList;

public class GemastikData {
    public static String[] gemastikcategoryName = {
            "PROGRAMMING",
            "CYBER SECURITY",
            "DATA MINING",
            "UX DESIGN",
            "ANIMATION",
            "SMART CITY",
            "ICT SCIENTIFIC PAPER",
            "SOFTWARE DEVELOPMENT",
            "SMART DEVICE, EMBEDDED SYSTEM & IoT",
            "GAME DEVELOPMENT",
            "ICT BUSINESS DEVELOPMENT"
    };

    public static String[] tittledescriprtion = {
            "Pemrograman",
            "Keamanan Siber",
            "Penambangan Data",
            "Desain Pengalaman Pengguna",
            "Animasi",
            "Kota Cerdas",
            "Karya Tulis Ilmiah TIK",
            "Pengembangan Perangkat Lunak",
            "Piranti Cerdas, Sistem Benam & IoT",
            "Pengembangan Aplikasi Permainan",
            "Pengembangan Bisnis TIK"
    };

    private static String[] gemastikcategoryDetail = {
            "Lomba pemrograman menguji kemampuan dan nalar peserta dalam menyelesaikan program komputer untuk memecahkan permasalahan yang diberikan. Kriteria penilaian mencakup kecepatan penulisan program dan ketepatan/efisiensi dari program yang dibuat untuk setiap kasus permasalahan terkait.\n\n" +
                    "Kriteria Penilaian :\n" +
                    "a) Program dapat menghasilkan jawaban yang benar dalam batas waktu eksekusi dan memori yang telah ditentukan;\n" +
                    "b) Jumlah soal yang berhasil diselesaikan;\n" +
                    "c) Waktu submission untuk soal yang berhasil diselesaikan;\n" +
                    "d) Tidak melakukan plagiarisme.",
            "Kompetisi Keamanan Siber ini bertujuan untuk menguji kemampuan peserta dalam menghadapi kasus keamanan sistem komputer dan jaringan yang telah disiapkan, termasuk di dalamnya keamanan data. Daya analisis dan kreativitas peserta ditantang untuk mencari kelemahan dalam suatu sistem yang telah dirancang untuk memiliki celah atau informasi tertentu yang memungkinan terjadinya peretasan pada sistem tersebut.\n\n" +
                    "Ketentuan Khusus\n" +
                    "a) Dilarang melakukan DoS (Denial of Service) dalam bentuk apapun.\n" +
                    "b) Dilarang melakukan kecurangan seperti berbagi flag, melihat pekerjaan tim\n" +
                    "lain, memberikan akun kepada orang di luar tim, atau melakukan kerja sama\n" +
                    "antar tim.\n" +
                    "c) Dilarang merusak sistem atau mengeksploitasi target berlebihan sehingga tidak\n" +
                    "bisa diselesaikan tim lain. Apabila peserta melakukan hal itu dengan tidak\n" +
                    "sengaja, harap langsung melaporkan ke panitia.\n" +
                    "d) Jika ada peserta yang menemukan celah di sistem penyisihan (di luar kasus yang\n" +
                    "disiapkan) harap melaporkan ke panitia untuk kemungkinan nilai tambahan.\n" +
                    "e) Tidak ada kasus yang membutuhkan online brute force. Akses berlebihan\n" +
                    "terhadap server mengakibatkan IP akan di-banned secara otomatis dalam\n" +
                    "rentang waktu tertentu.\n" +
                    "f) Segala bentuk kecurangan akan ditindak tegas.",
            "Penambangan Data yang semakin banyak menarik perhatian baik di kalangan industri maupun akademik dunia dewasa ini, terutama dengan penggunaan deep learning yang merupakan suatu algoritma mutakhir. Keunggulan deep learning dibandingkan dengan algoritma konvensional adalah kemampuan untuk melatih jutaan bahkan milyaran parameter pembelajaran yang tersusun secara hierarkis multi lapis. Selain berkat terobosan algoritma, deep learning juga telah dimungkinkan berkat tersedianya stream data atau big data yang diperlukan untuk melatih parameter dalam jumlahraksasa tersebut.\n\n" +
                    "Kriteria Penilaian :\n" +
                    "Penilaian Babak Penyisihan\n" +
                    "a) Penilaian utamanya adalah apakah peserta dapat menjadikan Deep Learning\n" +
                    "dan Big Data bagi solusi permasalahan yang ada di tanah air atau memberikan\n" +
                    "manfaat bagi kepentingan masyarakat;\n" +
                    "b) Laporan yang dikumpulkan tidak menentukan urutan. Laporan adalah syarat\n" +
                    "mutlak bagi peserta agar dapat membuktikan bahwa peserta mengerjakan\n" +
                    "penyisihan sendiri. Kegagalan peserta dalam memberikan laporan yang benar\n" +
                    "akan berakibat terhadap tidak diperhitungkannya peserta tersebut untuk lolos\n" +
                    "ke final.\n" +
                    "Penilaian Babak Final\n" +
                    "a) Perhitungan skor didasarkan pada tingkat akurasi terhadap data uji yakni 50%\n" +
                    "data yang tidak digunakan pada saat membangun model dan juga inovasi dan\n" +
                    "kejelasan dalam presentasi;\n" +
                    "b) Ranking diurutkan berdasarkan total poin di akhir kompetisi;\n" +
                    "c) Apabila ada peserta dengan total poin yang sama, maka akan diurutkan\n" +
                    "berdasarkan waktu terakhir peserta tersebut melakukan submission flag ke\n" +
                    "sistem lomba. Apabila masih sama, maka akan dilihat dari waktu submission\n" +
                    "sebelumnya.\n",
            "Lomba Desain Pengalaman Pengguna (UX Design) adalah lomba desain interaksi produk yang berorientasi pada kenyamanan dan kemudahan bagi pengguna. Dalam lomba ini yang menjadi fokus utama adalah pengalaman yang dirasakan pengguna ketika sedang menggunakan aplikasi tersebut secara menyeluruh. Para peserta lomba dituntut agar dapat merancang suatu antarmuka pengguna yang baik dengan menggunakan metode, sehingga didapatkan hasil desain aplikasi yang memiliki kualitas UX yang baik.\n\n",
            "Animasi merupakan sebuah lomba karya cipta dalam bentuk visualisasi 2D maupun 3D yang mengandung unsur kreativitas dan inovasi pemuda untuk menciptakan masyarakat yang berdikari, sehat serta mandiri berbasis TIK untuk kedaulatan bangsa, sebagai elemen penting dalam karya cipta tersebut. Karya berbentuk filmpendek dari bentuk digital animation.\n\n" +
                    "Kriteria Penilaian\n" +
                    "a) Lingkup kedalaman eksplorasi tema “TIK untuk Indonesia Maju” serta\n" +
                    "komunikatif dalam menyampaikan pesan.\n" +
                    "b) Karya harus mampu mengilustrasikan tema dan topik secara kreatif dan orisinil\n" +
                    "secara ide dan teknik animasi yang sesuai kaidah seni.\n" +
                    "c) Teknik pembuatan karya animasi dalam teknik modelling, pencahayaan,\n" +
                    "pergerakan, dan beragam teknik lainnya.\n" +
                    "d) Karya harus berasosiasi positif, tidak boleh mengandung unsur ras, politik,\n" +
                    "agama, pornografi, pornoaksi, serta tidak menjatuhkan/ mendiskreditkan pihak\n" +
                    "tertentu.\n" +
                    "e) Secara umum, karya animasi yang dikirim tidak boleh mengandung elemen\n" +
                    "yang melanggar hak cipta dan etika pembuatan karya cipta (bukan tiruan).\n" +
                    "f) Sinematografi, nilai artistik, nilai etika dari karya secara keseluruhan akan\n" +
                    "dinilai.",
            "Kota Cerdas atau smart city adalah suatu konsep mengenai pemanfaatan data untuk mengelola kota/melayani masyarakat. Inovasi kota cerdas dirancang guna melayani dan membantu berbagai kegiatan masyarakat, terutama dalam mengelola sumber daya secara efisien dan memberikan kemudahan akses informasi kepada masyarakat hingga untuk mengantisipasi kejadian yang tidak terduga.\n\n" +
                    "Ketentuan Khusus :\n" +
                    "a) Dilarang mengusulkan proposal yang telah diajukan pada kompetisi lain.\n" +
                    "b) Peserta yang lolos ke babak final diharuskan membawa laptop masing-masing.\n" +
                    "Panitia hanya menyiapkan jaringan lokal dan VM untuk kompetisi.",
            "Lomba Karya Tulis Ilmiah mendorong peserta untuk menumbuhkembangkan sebuah karya tulis mahasiswa dalam bentuk penuangan gagasan atau ide kreatif yang bersifat visioner dan implementatif untuk mencari solusi atas permasalahan bangsa yang siap terbit dengan mengikuti kaidah penulisan ilmiah. Pada GEMASTIK XIII ini, diharapkan peserta yang mengikuti cabang lomba ini mampu berinovasi dan menyajikan karya tulis ilmiah yang memberikan solusi dari segi TIK untuk kedaulatan bangsa.\n\n" +
                    "Ketentuan Khusus :\n" +
                    "a) Dilarang mengusulkan proposal yang telah diajukan pada kompetisi lain.\n" +
                    "b) Setiap artikel wajib menyertakan Surat Pernyataan yang berisi:\n" +
                    "1) Sumber Penulisan yang diacu, dan\n" +
                    "2) Naskah belum pernah diterbitkan/ dipublikasikan dalam bentuk prosiding\n" +
                    "maupun jurnal sebelumnya, ditandatangani ketua pengusul dan ketua\n" +
                    "prodi/ departemen/ jurusan serta dicap (Lampiran C)\n" +
                    "c) Peserta yang lolos ke babak final diharuskan membawa laptop masing-masing.\n" +
                    "Panitia hanya menyiapkan jaringan lokal dan VM untuk kompetisi",
            "Lomba pengembangan perangkat lunak menguji kemampuan peserta dalam mengembangkan ide kreatif untuk memberikan solusi penyelesaian masalah di Indonesia dalam bentuk perangkat lunak berkualitas tinggi. Fokus pada kategori ini adalah aspek inovasi yang kreatif dan pemanfaatan TIK untuk mencerdaskan masyarakat Indonesia sehingga perangkat yang dihasilkan mampu memberikan dampak untuk kemandirian dan kecerdasan masyarakat umum. Dampak ini harus dibuktikan bukan hanya dalam bentuk argumentasi namun juga harus didukung dengan data. Produk perangkat lunak yang dihasilkan harus bisa dioperasikan sehingga dampak tersebut dapat terukur. Platform produk perangkat lunak tidak dibatasi.\n\n" +
                    "Ketentuan Khusus\n" +
                    "Beberapa persyaratan khusus yang perlu diperhatikan oleh peserta yaitu sebagai\n" +
                    "berikut.\n" +
                    "a) Setiap tim hanya boleh mengajukan satu buah karya perangkat lunak.\n" +
                    "b) Karya perangkat lunak belum pernah dinyatakan sebagai pemenang (Juara I)\n" +
                    "dalam lomba TIK sebelumnya maupun pada kontes sejenis baik dalam skala\n" +
                    "lokal, nasional, regional, maupun internasional. Tim pengusul wajib membuat\n" +
                    "pernyataan bermaterai terkait hal ini.\n" +
                    "c) Karya perangkat lunak belum pernah terpublikasi baik secara komersiil\n" +
                    "maupun secara nonkomersiil kepada khalayak umum.\n" +
                    "d) Perangkat lunak dapat dijalankan pada platform umum tanpa tambahan\n" +
                    "perangkat keras khusus.\n" +
                    "e) Karya perangkat lunak yang diajukan merupakan ide orisinil dengan tidak\n" +
                    "menjiplak aplikasi yang sudah ada.\n" +
                    "f) Karya perangkat lunak tidak mengandung unsur SARA (Suku Agama Ras dan\n" +
                    "Antar Golongan).\n" +
                    "g) Jika karya adalah karya incremental atau karya yang dikembangkan dari\n" +
                    "kontes sebelumnya, peserta harus menjelaskan pada juri mengapa karya\n" +
                    "tersebut diikutsertakan dan memperlihatkan pembaruan karya tersebut\n" +
                    "dengan sebelumnya.\n" +
                    "h) Keputusan juri bersifat mutlak dan tidak dapat diganggu gugat.\n" +
                    "i) Peraturan yang belum tercantum akan ditambahkan di kemudian hari bila\n" +
                    "diperlukan.",
            "Piranti cerdas (smart device) adalah sebuah hasil karya teknologi yang bekerja secara interaktif, adaptif, dan otomatis, sehingga mampu memberikan suatu solusi bagi permasalahan sehari-hari. Tingkat kecerdasan suatu piranti dapat dicapai dengan memanfaatkan suatu kecerdasan buatan (artificial intelligent) yang sesuai dengan kebutuhan pemecahan masalah.\nSementara itu sistem benam (embedded system) adalah sebuah piranti keras (hardware) yang bekerja berdasarkan perintah dari piranti lunak (software) dan didesain memiliki tujuan dan fungsi yang spesifik. Dengan menggabungkan konsep piranti cerdas dan sistem benam, maka diharapkan dapat terciptanya sebuah sistem kompleks memiliki kualitas yang baik. Dilengkapi dengan antarmuka yang baik dan penggunaan sensor sebagai input dari keadaan lingkungan, piranti cerdas dapat bekerja secara efisien dan memberikan manfaat yang besar bagi lingkungan dan masyarakat.\nInternet of Things (IoT) atau Internet untuk Segalanya adalah suatu konsep dimana objek tertentu punya kemampuan untuk mentransfer data lewat jaringan tanpa memerlukan adanya interaksi dari manusia ke manusia ataupun dari manusia ke perangkat komputer. IoT bertujuan untuk memperluas manfaat dari konektivitas internet yang tersambung secara terus-menerus, sehingga memiliki kemampuan untuk berbagi data, kendali jarak jauh, dan sebagainya, termasuk juga pada benda di dunia nyata. ",
            "Lomba pengembangan aplikasi permainan mendorong peserta untuk berkreasi dan berinovasi mengembangkan aplikasi permainan yang mampu berjalan dengan baik untuk memenuhi tujuan yang dicapai, memperlihatkan sisi pendidikan, mempunyai dampak dan manfaat, sekaligus mengandung unsur menghibur (entertainment value) dari sebuah permainan.\n\n" +
                    "Ketentuan Khusus :\n" +
                    "Daftar informasi yang ada di bawah adalah persyaratan khusus untuk lomba\n" +
                    "pengembangan aplikasi permainan yang harus dipenuhi peserta lomba selain\n" +
                    "persyaratan umum yang sudah disampaikan pada bagian awal dokumen panduan ini.\n" +
                    "1. Semua berkas pengumpulan dikumpulkan secara online melalui sistem\n" +
                    "https://gemastik13.telkomuniversity.ac.id sebelum batas akhir yang sudah\n" +
                    "ditentukan. Pengumpulan setelah batas akhir menyebabkan peserta yang\n" +
                    "bersangkutan gugur dalam perlombaan;\n" +
                    "2. Permainan harus bisa dijalankan pada sebuah mesin komputasi (PC, smartphone,\n" +
                    "portable device, atau yang lainnya);\n" +
                    "3. Aplikasi permainan yang dikembangkan boleh dijalankan di platform manapun\n" +
                    "(bebas), misal seperti Linux, Mac, Windows, Android (smartphone), Internet\n" +
                    "Browser, portable device, atau lain sebagainya;\n" +
                    "4. Karya yang dilombakan belum pernah dipublikasikan sebelumnya baik secara\n" +
                    "komersiil maupun nonkomersiil, termasuk belum pernah dipublikasikan di\n" +
                    "application store atau tersedia bebas di media online;\n" +
                    "5. Peserta harus mempunyai hak penuh terhadap aplikasi permainan yang\n" +
                    "dikembangkan. Panitia tidak akan menggunakan sedikitpun semua yang ada pada\n" +
                    "aplikasi permainan tanpa izin tertulis secara formal dari pihak peserta;\n" +
                    "6. Peserta boleh menggunakan teknologi manapun untuk pengembangan aplikasi\n" +
                    "permainan, seperti game engine, framework, dan model. Namun, peserta harus\n" +
                    "memiliki hak penuh terhadap teknologi-teknologi tersebut, atau pastikan teknologi\n" +
                    "yang digunakan memang tersedia secara gratis. Peserta dilarang keras\n" +
                    "menggunakan teknologi yang didapatkan secara ilegal, misal bajakan;\n" +
                    "7. Peserta boleh menggunakan aset manapun (seperti suara, musik, atau gambar yang\n" +
                    "digunakan pada permainan). Namun, peserta harus memiliki hak penuh terhadap\n" +
                    "aset tersebut, atau pastikan aset tersebut memang tersedia secara gratis. Jika\n" +
                    "peserta menggunakan aset gratis yang sudah tersedia, peserta wajib\n" +
                    "mencantumkan sumber pengambilan pada bagian credit. Agar tidak melakukan\n" +
                    "kesalahan terkait isu hak cipta, perhatikan dengan baik lisensi setiap aset yang\n" +
                    "didapatkan: public domain, creative common (perhatikan dengan seksama apakah\n" +
                    "boleh dimodifikasi atau tidak), dan sebagainya;\n" +
                    "8. Karya yang dilombakan tidak boleh mengandung unsur SARA, radikalisme,\n" +
                    "pornografi, dan kekerasan;\n" +
                    "9. Peserta harus memastikan bahwa aplikasi permainan tidak menyalahi aturan\n" +
                    "hukum yang berlaku di Indonesia.",
            "Kategori lomba ini adalah kompetisi pengembangan model bisnis dengan produk TIK. Lomba ini memberikan kesempatan kepada peserta yang memiliki ide bisnis, start up dan pengembangan usaha yang berorientasi pada produk TIK, baik berupa jasa dan produk. Lomba ini akan menyeleksi ide pengembangan bisnis dalam bentuk ringkasan eksekutif, rencana bisnis, dan kompetisi produk berserta proyeksi bisnisnya dalam bentuk MVP (Minimum Viable Product).\n\n" +
                    "Ketentuan Khusus :\n" +
                    "a) Setiap tahap lomba dapat disiarkan melalui media radio, televisi, dan Internet.\n" +
                    "b) Data atau informasi yang dibahas atau dipresentasikan harus dianggap sebagai\n" +
                    "informasi yang dimungkinkan masuk dalam ranah publik.\n" +
                    "c) Hak cipta dan perizinan: Jika tim menggunakan materi berhak cipta dan/atau\n" +
                    "gambar dari pihak ketiga dalam dokumen atau presentasi, maka tim harus\n" +
                    "mendapatkan izin dan otorisasi terlebih dahulu dari pemilik untuk\n" +
                    "menggunakan materi tersebut.\n" +
                    "d) Dalam kompetisi ini panitia GEMASTIK menjamin Ide peserta adalah\n" +
                    "sepenuhnya milik peserta (mahasiswa dan/atau universitas) yang diwakilinya.\n" +
                    "e) Peserta mengijinkan panitia mempublikasikan ide karya peserta dalam bentuk\n" +
                    "abstraksi untuk mendorong kreativitas dan inovasi di kalangan universitas di\n" +
                    "media internal GEMASTIK.\n" +
                    "f) Panitia dan juri mewakili Kemendikbud yang akan memberikan support dan\n" +
                    "masukan bagi peserta untuk pengembangan usahanya, dan menjamin tidak\n" +
                    "akan memberikan proposal peserta kepada pihak ketiga.\n" +
                    "g) Peserta dan juri akan menandatangani NDA (Non-Disclosure Agreement) yang\n" +
                    "diketahui oleh Panitia GEMASTIK."
    };

    private static int[] gemastikcategoryImage = {
            R.drawable.programming,
            R.drawable.cybersecurity,
            R.drawable.datamining,
            R.drawable.ux_design,
            R.drawable.animation,
            R.drawable.smartcity,
            R.drawable.ict_scientificpaper,
            R.drawable.softwaredevelopment,
            R.drawable.iot,
            R.drawable.gamedevelopment,
            R.drawable.ict_businessdevelopment
    };

    static ArrayList<Gemastik> getListData() {
        ArrayList<Gemastik> list = new ArrayList<>();
        for (int position = 0; position < gemastikcategoryName.length; position++) {
            Gemastik gemastik = new Gemastik();
            gemastik.setName(gemastikcategoryName[position]);
            gemastik.setDescription(tittledescriprtion[position]);
            gemastik.setDetail(gemastikcategoryDetail[position]);
            gemastik.setPhoto(gemastikcategoryImage[position]);
            list.add(gemastik);
        }
        return list;
    }
}
