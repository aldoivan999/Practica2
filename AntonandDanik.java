/*
A Anton le gusta jugar ajedrez, y a su amigo Danik también.

Una vez que han jugado n juegos seguidos. Para cada juego se sabe quién
 fue el ganador: Anton o Danik.
 Ninguno de los juegos terminó con empate.

Ahora Anton se pregunta, ¿quién ganó más juegos, él o Danik?
 Ayúdale a determinar esto.
*/

import java.io.*;
import java.util.*;
 
public class prac2 {
    public static void solution(BufferedReader reader, PrintWriter writer)
            throws IOException {
        In in = new In(reader);
        Out out = new Out(writer);
        int n = in.nextInt(), a = 0;
        for (char c : in.next().toCharArray())
            if (c == 'A')
                a++;
        a += a;
        if (a < n)
            out.println("Danik");
        else if (a == n)
            out.println("Friendship");
        else
            out.println("Anton");
    }
 
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(
                new BufferedWriter(new OutputStreamWriter(System.out)));
        solution(reader, writer);
        writer.close();
    }
 
    protected static class In {
        private BufferedReader reader;
        private StringTokenizer tokenizer = new StringTokenizer("");
 
        public In(BufferedReader reader) {
            this.reader = reader;
        }
 
        public String next() throws IOException {
            while (!tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
            return tokenizer.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
 
        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }
 
        public int[] nextIntArray1(int n) throws IOException {
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextInt();
            return a;
        }
 
        public int[] nextIntArraySorted(int n) throws IOException {
            int[] a = nextIntArray(n);
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int j = i + r.nextInt(n - i);
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            Arrays.sort(a);
            return a;
        }
 
        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
 
        public long[] nextLongArray1(int n) throws IOException {
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextLong();
            return a;
        }
 
        public long[] nextLongArraySorted(int n) throws IOException {
            long[] a = nextLongArray(n);
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int j = i + r.nextInt(n - i);
                long t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
            Arrays.sort(a);
            return a;
        }
    }
 
    protected static class Out {
        private PrintWriter writer;
        private static boolean local = System
                .getProperty("ONLINE_JUDGE") == null;
 
        public Out(PrintWriter writer) {
            this.writer = writer;
        }
 
        public void print(char c) {
            writer.print(c);
        }
 
        public void print(int a) {
            writer.print(a);
        }
 
        public void println(String s) {
            writer.println(s);
        }
 
        public void println(int a) {
            writer.println(a);
        }
 
        public void println(long a) {
            writer.println(a);
        }
 
        public void println(Object[] os) {
            for (int i = 0; i < os.length; i++) {
                writer.print(os[i]);
                writer.print(' ');
            }
            writer.println();
        }
 
        public void println(int[] a) {
            for (int i = 0; i < a.length; i++) {
                writer.print(a[i]);
                writer.print(' ');
            }
            writer.println();
        }
 
        public void println(long[] a) {
            for (int i = 0; i < a.length; i++) {
                writer.print(a[i]);
                writer.print(' ');
            }
            writer.println();
        }
 
        public static void db(Object... objects) {
            if (local)
                System.out.println(Arrays.deepToString(objects));
        }
    }
}

