# 🎮 CARA MAIN LUDO ELITE - MODE LOKAL

## ⚡ Quick Start (30 Detik)

### 1️⃣ Jalankan Aplikasi

**Cara 1 (Double-click):**
```
Double-click file: run.bat
```

**Cara 2 (Command line):**
```bash
mvn javafx:run
```

**Cara 3 (Jika sudah compile):**
```bash
java -jar target/LudoApp-1.0-SNAPSHOT.jar
```

---

### 2️⃣ Tampilan Awal

Aplikasi akan **langsung masuk ke Dashboard** (tidak perlu login!)

**Dashboard menampilkan:**
- Tabel game (akan kosong karena backend tidak jalan)
- Statistik (0/0/0)
- Menu navigasi

**PENTING:** Abaikan tabel kosong - ini normal karena mode lokal!

---

### 3️⃣ Mulai Main Game

Klik tombol **"Play Game"** di sidebar

✅ **Game board akan langsung muncul!**

---

### 4️⃣ Cara Bermain

#### Setup (Otomatis):
- 4 pemain: Red, Green, Yellow, Blue
- Setiap pemain punya 4 bidak
- Game dimulai dengan giliran Red

#### Giliran Bermain:
1. **Klik "ROLL DICE"** - akan muncul angka 1-6
2. **Klik bidak yang mau digerakkan** - bidak akan bergerak otomatis
3. Giliran beralih ke pemain berikutnya

#### Aturan:
- ✅ **Roll 6** = bidak bisa keluar dari base + dapat giliran lagi
- ✅ **Roll 6 sebanyak 3x berturut-turut** = skip turn
- ✅ **Makan bidak lawan** = bidak lawan kembali ke base
- ✅ **Safe zone (★)** = tidak bisa dimakan
- ✅ **Masuk finish** = harus pas (exact count)
- ✅ **Menang** = semua 4 bidak masuk finish

---

### 5️⃣ Tips Bermain

**Mode Local = 1 komputer, bergantian:**
- Pemain 1 → roll + move
- Pemain 2 → roll + move
- Pemain 3 → roll + move
- Pemain 4 → roll + move
- ... dan seterusnya

**UI Feedback:**
- **Hijau highlight** = pemain yang sedang giliran
- **Glow effect** = bidak yang bisa digerakkan
- **Animasi** = bidak bergerak ke posisi baru
- **Alert** = pemberitahuan pemenang

---

## 🔧 Troubleshooting

### ❌ "Error: Backend connection failed"
**Solusi:** Abaikan! Mode lokal tidak butuh backend.

### ❌ "Tabel game kosong di dashboard"
**Solusi:** Normal untuk mode lokal. Langsung klik "Play Game".

### ❌ "Cannot load games"
**Solusi:** Abaikan pesan error. Dashboard sudah diset untuk skip error ini.

### ❌ "Aplikasi tidak mau jalan"
**Solusi:** Pastikan Java 17+ terinstall:
```bash
java -version
```

### ❌ "mvn: command not found"
**Solusi:** Install Maven atau gunakan `run.bat`

---

## 🎯 Apa yang Berfungsi di Mode Lokal?

### ✅ BERFUNGSI:
- ✅ Dashboard
- ✅ Game board
- ✅ Semua aturan Ludo
- ✅ 4 pemain (bergantian di 1 komputer)
- ✅ Roll dice
- ✅ Gerak bidak
- ✅ Makan bidak lawan
- ✅ Safe zones
- ✅ Deteksi pemenang
- ✅ Animasi & visual

### ❌ TIDAK BERFUNGSI:
- ❌ Login/Register (butuh backend)
- ❌ Multiplayer online (butuh backend)
- ❌ Simpan game (butuh backend)
- ❌ Statistik pemain (butuh backend)
- ❌ History game (butuh backend)

---

## 🚀 Mode Lanjutan

### Jika Ingin Multiplayer Online:

1. **Start Backend:**
   ```bash
   cd backend
   mvn spring-boot:run
   ```

2. **Buka 2+ Aplikasi:**
   ```bash
   run.bat  # Terminal 1 (Player 1)
   run.bat  # Terminal 2 (Player 2)
   ```

3. **Create & Join Game:**
   - Player 1: Create game
   - Player 2: Join game
   - Real-time play via WebSocket

**CATATAN:** Backend belum selesai! Lihat `BACKEND_FINAL_STATUS.md` untuk status.

---

## 📝 Perubahan yang Dibuat

### File yang Dimodifikasi untuk Mode Lokal:

1. **`LudoEliteApp.java`**
   - Bypass login check
   - Langsung ke dashboard

2. **`DashboardController.java`**
   - Handle error backend gracefully
   - Show "Local Mode" message

### Jika Ingin Kembalikan ke Normal:

Edit `LudoEliteApp.java`, uncomment baris ini:
```java
if (SessionManager.getInstance().isLoggedIn()) {
    ViewNavigator.navigateToDashboard();
} else {
    ViewNavigator.navigateToLogin();
}
```

Dan comment baris:
```java
ViewNavigator.navigateToDashboard();
```

---

## 🎮 SELAMAT BERMAIN!

**Shortcut:**
1. Run: `mvn javafx:run` atau `run.bat`
2. Klik: "Play Game"
3. Roll & Move!

**Enjoy! 🎲**
