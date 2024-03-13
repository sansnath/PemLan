package praktikumsatu;

public class perpus {

        private String[][] teknologi;
        private String[][] filsafat;
        private String[][] sejarah;
        private String[][] agama;
        private String[][] psikologi;
        private String[][] politik;
        private String[][] fiksi;

        public perpus() {
                this.teknologi = new String[][] {
                                { "Deep Learning with Python", "Francois Chollet", "528", "2021",
                                                "Manning Publications",
                                                "Buku ini memberikan panduan komprehensif tentang teknik deep learning dengan bahasa pemrograman Python." },
                                { "The Pragmatic Programmer: From Journeyman to Master", "Andrew Hunt, David Thomas",
                                                "392", "2000", "Addison-Wesley Professional",
                                                "Buku ini merupakan panduan praktis dalam pemrograman yang menekankan pemikiran kritis dan pembelajaran." },
                                { "Algorithms", "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein",
                                                "1392", "2022", "MIT Press",
                                                "Buku teks komprehensif tentang algoritma komputer lorem ipsum lorem ipsum lorem ipsum lorem." },
                                { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1118",
                                                "2021", "Pearson Education Limited",
                                                "Sebuah pengantar tentang prinsip dan praktik kecerdasan buatan yang sangat berguna untuk masa depan." },
                                { "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "431",
                                                "2008", "Pearson Education",
                                                "Panduan untuk menulis kode yang bersih, mudah dipahami, dan efisien." }
                };

                this.filsafat = new String[][] {
                                { "Meditasi", "Marcus Aurelius & William Henry Fremantle", "208", "186",
                                                "Modern Library",
                                                "Kumpulan tulisan pribadi oleh Kaisar Romawi Marcus Aurelius Lorem ipsum." },
                                { "Republik", "Plato & Allan Bloom", "384", "380 SM", "Hackett Publishing Company",
                                                "Tulisan filosofis Plato tentang keadilan dan masyarakat ideal Lorem Ipsum." },
                                { "Kritik atas Nalar Murni", "Immanuel Kant", "664", "1781",
                                                "Cambridge University Press",
                                                "Kritik Kant terhadap nalar murni, yang membahas metafisika dan epistemologi lorem ipsum lorem ipsum." },
                                { "Leviathan", "Thomas Hobbes", "448", "1651", "Oxford University Press",
                                                "Filosofi politik Hobbes tentang struktur masyarakat dan pemerintahan lorem ipsum lorem ipsums." },
                                { "Dua Risalah tentang Pemerintahan", "John Locke", "256", "1689",
                                                "Hackett Publishing Company",
                                                "Tulisan Locke tentang kontrak sosial dan batas otoritas pemerintah lorem ipsum lorem ipsum lorem." }
                };

                this.sejarah = new String[][] {
                                { "Sapiens: Riwayat Singkat Umat Manusia", "Yuval Noah Harari", "512", "2011",
                                                "Harvill Secker",
                                                "Sebuah perjalanan sejarah tentang manusia dari zaman purba hingga masa kini." },
                                { "Sejarah Indonesia Modern", "T.B. Simatupang", "504", "1975",
                                                "Penerbit Universitas Indonesia",
                                                "Sebuah kajian tentang perkembangan sejarah Indonesia dari masa kolonial hingga kemerdekaan." },
                                { "Senjata Kuman dan Baja", "Jared Diamond", "480", "1997", "W.W. Norton & Company",
                                                "Sebuah analisis tentang dampak penyakit dan teknologi terhadap peradaban manusia." },
                                { "Sejarah Kebudayaan Indonesia", "Sartono Kartodirdjo", "352", "2012",
                                                "Gramedia Pustaka Utama",
                                                "Kajian tentang perkembangan kebudayaan Indonesia dari masa pra sejarah hingga modern." },
                                { "Sejarah Perang Dunia II", "A.J.P. Taylor", "768", "1974", "Penguin Books",
                                                "Sebuah analisis tentang konflik global yang melibatkan negara-negara besar pada abad ke-20." }
                };

                this.agama = new String[][] {
                                { "Merebut Kembali Surga: Mengapa Orang Kristen Harus Berperan dalam Politik",
                                                "Os Guinness & John Beavis", "288", "2010", "InterVarsity Press",
                                                "Sebuah pandangan tentang peran politik orang Kristen dalam masyarakat lorem ipsum." },
                                { "The Case for Christ: A Journalist's Investigative Journey into the Evidence for Jesus",
                                                "Lee Strobel & William Lane Craig", "320", "1998", "Zondervan",
                                                "Sebuah penyelidikan jurnalistik tentang bukti-bukti keberadaan Yesus Kristus lorem ipsum." },
                                { "The Cross: Jesus in the Shadow of the Cross", "Michael F. Bird", "224", "2012",
                                                "Crossway",
                                                "Sebuah refleksi tentang arti salib dalam kehidupan agama khusunya agama Kristen lorem ipsum." },
                                { "Desiring God: Meditations of a Christian Hedonist", "John Piper", "240", "1986",
                                                "Multnomah Publishers",
                                                "Sebuah pandangan tentang kepuasan pribadi dalam kehidupan agama Kristen lorem ipsum." },
                                { "The Discipline of Grace: God's Role and Ours in the Process of Sanctification",
                                                "Jerry Bridges", "192", "1994", "NavPress",
                                                "Sebuah penelusuran tentang peran anugerah dalam proses penyucian rohani lorem ipsum." }
                };

                this.psikologi = new String[][] {
                                { "Thinking, Fast and Slow", "Daniel Kahneman", "512", "2011",
                                                "Farrar, Straus and Giroux",
                                                "Sebuah eksplorasi tentang dua sistem pemikiran manusia lorem ipsum lorem." },
                                { "The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg",
                                                "288", "2012", "Random House",
                                                "Sebuah penelitian tentang kebiasaan dan bagaimana mengubahnya lorem ipsum lorem." },
                                { "Man's Search for Meaning", "Viktor E. Frankl", "160", "1946", "Beacon Press",
                                                "Sebuah refleksi tentang arti hidup dari pengalaman di kamp konsentrasi Nazi lorem ipsum lorem." },
                                { "The Gift of Therapy", "Irvin D. Yalom", "304", "2002", "HarperCollins",
                                                "Sebuah panduan praktis tentang terapi dan hubungan manusiawi lorem ipsum lorem." },
                                { "Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi", "230",
                                                "1990", "HarperCollins",
                                                "Sebuah eksplorasi tentang pengalaman optimal dan kepuasan dalam kehidupan lorem ipsum lorem." }
                };

                this.politik = new String[][] {
                                { "Leviathan", "Thomas Hobbes", "376", "1651", "Penguin Classics",
                                                "Sebuah karya tentang filosofi politik dan teori negara oleh Thomas Hobbes yang nantinya bisa berguna untuk masyarakat luas." },
                                { "The Prince", "Niccolò Machiavelli", "112", "1532", "Dover Publications",
                                                "Sebuah panduan tentang kepemimpinan politik oleh Niccolò Machiavelli untuk memimpin suat masyarakat." },
                                { "Two Treatises of Government", "John Locke", "176", "1689",
                                                "Cambridge University Press",
                                                "Sebuah penelitian tentang sifat pemerintahan dan hak asasi manusia yang terjadi di belahan dunia dalam pemerintahan." },
                                { "The Republic", "Plato", "384", "380 SM", "Hackett Publishing Company",
                                                "Sebuah dialog filosofis tentang gagasan masyarakat yang memang terkenal ideal." },
                                { "The Wealth of Nations", "Adam Smith", "976", "1776", "Everyman's Library",
                                                "Sebuah karya ekonomi tentang pasar bebas dan divisi kerja oleh Adam Smith." }
                };

                this.fiksi = new String[][] {
                                { "The Chronicles of Narnia (series)", "C.S. Lewis", "Varies", "1950-1956",
                                                "HarperCollins",
                                                "Sebuah kisah petualangan fantasi yang membawa pembaca ke negeri Narnia." },
                                { "The Percy Jackson & the Olympians (series)", "Rick Riordan", "Varies", "2005-2009",
                                                "Hyperion Books for Young Readers",
                                                "Kisah seorang demigod, Percy Jackson, dan petualangannya di dunia mitologi Yunani." },
                                { "A Song of Ice and Fire (series)", "George R.R. Martin", "Varies", "1996-present",
                                                "Bantam Books",
                                                "Sebuah epik fantasi yang sangat bagus menceritakan tentang perjuangan kekuasaan di daratan Westeros." },
                                { "The Lord of the Rings (trilogy)", "J.R.R. Tolkien", "1178", "1954-1955",
                                                "Allen & Unwin",
                                                "Sebuah kisah tentang perjalanan epik yang sangat menarik dengan tujuan untuk menghancurkan cincin kekuasaan." },
                                { "The Hunger Games (trilogy)", "Suzanne Collins", "Varies", "2008-2010",
                                                "Scholastic Press",
                                                "Sebuah kisah distopia tentang pertempuran untuk bertahan hidup di arena pembunuhan." }
                };
        }

        public String[][] getTeknologi() {
                return teknologi;
        }

        public String[][] getFilsafat() {
                return filsafat;
        }

        public String[][] getSejarah() {
                return sejarah;
        }

        public String[][] getAgama() {
                return agama;
        }

        public String[][] getPsikologi() {
                return psikologi;
        }

        public String[][] getPolitik() {
                return politik;
        }

        public String[][] getFiksi() {
                return fiksi;
        }

        public static void nampilinbuku(String[][] daftarbuku) {
                for (int i = 0; i < daftarbuku.length; i++) {
                        System.out.println("Judul: " + daftarbuku[i][0]);
                        System.out.println("Penulis: " + daftarbuku[i][1]);
                        System.out.println("Halaman: " + daftarbuku[i][2]);
                        System.out.println("Tahun Terbit: " + daftarbuku[i][3]);
                        System.out.println("Penerbit: " + daftarbuku[i][4]);
                        System.out.println("Sinopsis: " + daftarbuku[i][5]);
                        System.out.println();
                }
        }

        private int hitungjumlahbuku(String[][] daftarbuku) {
                return daftarbuku.length;
        }

        public int hasiljumlah() {
                int hasil = 0;
                hasil += hitungjumlahbuku(teknologi);
                hasil += hitungjumlahbuku(filsafat);
                hasil += hitungjumlahbuku(sejarah);
                hasil += hitungjumlahbuku(agama);
                hasil += hitungjumlahbuku(psikologi);
                hasil += hitungjumlahbuku(politik);
                hasil += hitungjumlahbuku(fiksi);
                return hasil;
        }

        public int hitungJumlahKataSinopsisBuku(String[] buku) {
                String sinopsis = buku[5];
                String[] kataSinopsis = sinopsis.split(" ");
                return kataSinopsis.length;
        }

        private String[][] copybuku(String[][] perpusAsli, int jumlahBuku) {
                String[][] copy = new String[jumlahBuku][];
                for (int i = 0; i < jumlahBuku; i++) {
                        copy[i] = new String[perpusAsli[i].length];
                        for (int j = 0; j < perpusAsli[i].length; j++) {
                                copy[i][j] = perpusAsli[i][j];
                        }
                }
                return copy;
        }

        public perpus(perpus perpusAsli) {
                this.teknologi = copybuku(perpusAsli.teknologi, 2);
                this.filsafat = copybuku(perpusAsli.filsafat, 3);
                this.sejarah = copybuku(perpusAsli.sejarah, 4);
                this.agama = copybuku(perpusAsli.agama, 5);
                this.psikologi = copybuku(perpusAsli.psikologi, 5);
                this.politik = copybuku(perpusAsli.politik, 5);
                this.fiksi = copybuku(perpusAsli.fiksi, 3);
        }

        public double cekKesamaan(perpus lain) {
                double totalKesamaan = 0.0;
                int jumlahAtribut = 0;

                totalKesamaan += hitungKesamaanBuku(this.teknologi, lain.teknologi);
                totalKesamaan += hitungKesamaanBuku(this.filsafat, lain.filsafat);
                totalKesamaan += hitungKesamaanBuku(this.sejarah, lain.sejarah);
                totalKesamaan += hitungKesamaanBuku(this.agama, lain.agama);
                totalKesamaan += hitungKesamaanBuku(this.psikologi, lain.psikologi);
                totalKesamaan += hitungKesamaanBuku(this.politik, lain.politik);
                totalKesamaan += hitungKesamaanBuku(this.fiksi, lain.fiksi);

                jumlahAtribut += (this.teknologi.length * this.teknologi[0].length);
                jumlahAtribut += (this.filsafat.length * this.filsafat[0].length);
                jumlahAtribut += (this.sejarah.length * this.sejarah[0].length);
                jumlahAtribut += (this.agama.length * this.agama[0].length);
                jumlahAtribut += (this.psikologi.length * this.psikologi[0].length);
                jumlahAtribut += (this.politik.length * this.politik[0].length);
                jumlahAtribut += (this.fiksi.length * this.fiksi[0].length);
                double rataRataKesamaan = totalKesamaan / jumlahAtribut;

                return rataRataKesamaan * 100.0;
        }

        private double hitungKesamaanBuku(String[][] buku1, String[][] buku2) {
                double totalKesamaan = 0.0;

                int jmlhSedikit = Math.min(buku1.length, buku2.length);

                for (int i = 0; i < jmlhSedikit; i++) {
                        for (int j = 0; j < buku1[i].length; j++) {
                                if (buku1[i][j].equals(buku2[i][j])) {
                                        totalKesamaan += 1.0;
                                }
                        }
                }

                return totalKesamaan;
        }
}
