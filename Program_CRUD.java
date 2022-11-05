/**
 * Program Penerimaan Peserta DIdik Baru (PPDB) SMKN 1 Majalengka!
 * 
 * ANGGOTA KELOMPOK :
 * Agis M F
 * Gina S
 * Neza
 * Zheka Baila Arkan
 */

package program_crud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program_CRUD {
    
    // object
    static ArrayList listSiswa = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    static String garis = "-------------------------"; 
    
    // function show Menu
    static void showMenu() throws IOException {
    System.out.println("+========= MENU ========+");
    System.out.println("! [1] Show All Siswa    !");
    System.out.println("! [2] Insert Siswa      !");
    System.out.println("! [3] Edit Siswa        !");
    System.out.println("! [4] Delete Siswa      !");
    System.out.println("! [5] Exit              !");
    System.out.println("+=======================+");
    System.out.println();
    System.out.print("PILIH MENU > ");
    
    int selectedMenu = Integer.valueOf(input.readLine());
    
        switch(selectedMenu){
            case 1:
                showAllSiswa();
            break;
            case 2:
                insertSiswa();
            break;
            case 3:
                editSiswa();
            break;
            case 4:
                deleteSiswa();
            break;
            case 5:
                System.exit(0);
            break;
            default:
            System.out.println("Pilihan salah!");
        }
    }
    
    // function show All
    static void showAllSiswa(){
        if(listSiswa.isEmpty()){
            System.out.println("Anda belum memasukan data!!!");
        } else {    // tampilkan semua Siswa
            for(int i = 0; i < listSiswa.size(); i++){
                System.out.println(String.format("[%d] %s",i, listSiswa.get(i)));
            }
        }
            System.out.println();
            System.out.println(garis);
            System.out.println();
    }
    
    // function insert
    static void insertSiswa() throws IOException{
        System.out.print("Nama Siswa: ");
        String namaBuah = input.readLine();
        listSiswa.add(namaBuah);
        
        System.out.println();
        System.out.println(garis);
        System.out.println();
    }
    
    // function edit
    static void editSiswa() throws IOException{
        if (listSiswa.isEmpty()) {
            System.out.println("Anda belum memasukan data!!!");
        } else {
            showAllSiswa();
            System.out.print("Pilih nomer Siswa: ");
            int indexSiswa = Integer.valueOf(input.readLine());

            System.out.print("Nama Siswa Baru: ");
            String namaBaru = input.readLine();

            // ubah nama buah
            listSiswa.set(indexSiswa, namaBaru);
        }
        
        System.out.println();
        System.out.println(garis);
        System.out.println();
    }
    
    // function delete
    static void deleteSiswa() throws IOException{
        if (listSiswa.isEmpty()) {
            System.out.println("Anda belum memasukan data!!!");
        } else {
            showAllSiswa();
            System.out.print("Pilih nomer Siswa: ");
            int indexSiswa = Integer.valueOf(input.readLine());
            // hapus buah
            listSiswa.remove(indexSiswa);
        }
        
        System.out.println();
        System.out.println(garis);
        System.out.println();
    }
    
        // function
    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isRunning);
    }
    
}
