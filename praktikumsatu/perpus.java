package praktikumsatu;

public class perpus {

        private String[][] teknologi = { { "Deep Learning with Python", "Francois Chollet", "528", "2021",
                        "Manning Publications" },
                        { "The Pragmatic Programmer: From Journeyman to Master",
                                        "Andrew Hunt, David Thomas", "392", "2000", "Addison-Wesley Professional" },
                        { "Algorithms",
                                        "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein",
                                        "1392", "2022",
                                        "MIT Press" },
                        { "Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "1118",
                                        "2021", "Pearson Education Limited" },
                        { "Clean Code: A Handbook of Agile Software Craftsmanship",
                                        "Robert C. Martin", "431", "2008", "Pearson Education" }, };

        private String[][] filsafat = {
                        { "Meditasi", "Marcus Aurelius & William Henry Fremantle", "208", "186", "Modern Library" },
                        { "Republik", "Plato & Allan Bloom", "384", "380 SM", "Hackett Publishing Company" },
                        { "Kritik atas Nalar Murni", "Immanuel Kant", "664", "1781", "Cambridge University Press" },
                        { "Leviathan", "Thomas Hobbes", "448", "1651", "Oxford University Press" },
                        { "Dua Risalah tentang Pemerintahan", "John Locke", "256", "1689",
                                        "Hackett Publishing Company" }
        };

        private String[][] sejarah = { { "Sapiens: Riwayat Singkat Umat Manusia", "Yuval Noah Harari", "512", "2011",
                        "Harvill Secker" },
                        { "Sejarah Indonesia Modern", "T.B. Simatupang", "504", "1975",
                                        "Penerbit Universitas Indonesia" },
                        { "Senjata Kuman dan Baja", "Jared Diamond", "480", "1997",
                                        "W.W. Norton & Company" },
                        { "Sejarah Kebudayaan Indonesia", "Sartono Kartodirdjo", "352", "2012",
                                        "Gramedia Pustaka Utama" },
                        { "Sejarah Perang Dunia II", "A.J.P. Taylor", "768", "1974",
                                        "Penguin Books" } };

        private String[][] agama = {
                        { "Merebut Kembali Surga: Mengapa Orang Kristen Harus Berperan dalam Politik",
                                        "Os Guinness & John Beavis", "288", "2010", "InterVarsity Press" },
                        { "The Case for Christ: A Journalist's Investigative Journey into the Evidence for Jesus",
                                        "Lee Strobel & William Lane Craig", "320", "1998", "Zondervan" },
                        { "The Cross: Jesus in the Shadow of the Cross", "Michael F. Bird", "224", "2012", "Crossway" },
                        { "Desiring God: Meditations of a Christian Hedonist", "John Piper", "240", "1986",
                                        "Multnomah Publishers" },
                        { "The Discipline of Grace: God's Role and Ours in the Process of Sanctification",
                                        "Jerry Bridges", "192", "1994", "NavPress" } };

        private String[][] psikologi = {
                        { "Thinking, Fast and Slow", "Daniel Kahneman", "512", "2011", "Farrar, Straus and Giroux" },
                        { "The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "288",
                                        "2012", "Random House" },
                        { "Man's Search for Meaning", "Viktor E. Frankl", "160", "1946", "Beacon Press" },
                        { "The Gift of Therapy", "Irvin D. Yalom", "304", "2002", "HarperCollins" },
                        { "Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi", "230", "1990",
                                        "HarperCollins" } };

        private String[][] politik = { { "Leviathan", "Thomas Hobbes", "376", "1651", "Penguin Classics" },
                        { "The Prince", "Niccolò Machiavelli", "112", "1532", "Dover Publications" },
                        { "Two Treatises of Government", "John Locke", "176", "1689", "Cambridge University Press" },
                        { "The Republic", "Plato", "384", "380 BC", "Hackett Publishing Company" },
                        { "The Wealth of Nations", "Adam Smith", "976", "1776", "Everyman's Library" } };

        private String[][] fiksi = {
                        { "The Chronicles of Narnia (series)", "C.S. Lewis", "Varies", "1950-1956", "HarperCollins" },
                        { "The Percy Jackson & the Olympians (series)", "Rick Riordan", "Varies", "2005-2009",
                                        "Hyperion Books for Young Readers" },
                        { "A Song of Ice and Fire (series)", "George R.R. Martin", "Varies", "1996-present",
                                        "Bantam Books" },
                        { "The Lord of the Rings (trilogy)", "J.R.R. Tolkien", "1178", "1954-1955", "Allen & Unwin" },
                        { "The Hunger Games (trilogy)", "Suzanne Collins", "Varies", "2008-2010",
                                        "Scholastic Press" } };

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
}
