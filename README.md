# 🏦 MiniBank — Hệ thống tài khoản ngân hàng & giao dịch an toàn

## 🎯 Mục tiêu dự án
Ứng dụng console mô phỏng hệ thống ngân hàng với các chức năng quản lý tài khoản và giao dịch, được xây dựng bằng C# theo chuẩn OOP.  
Mục tiêu:
- Vận dụng **đóng gói, kế thừa, đa hình, trừu tượng hóa**.
- Thiết kế **interface** cho hành vi lãi suất và phí.
- Tạo và xử lý **ngoại lệ tùy chỉnh** để đảm bảo an toàn giao dịch.
- Viết ứng dụng console có **menu tương tác**, nhập liệu an toàn, thông báo lỗi rõ ràng.
- (Nâng cao) **Đọc/Ghi dữ liệu CSV/JSON**, logging giao dịch, sắp xếp/tìm kiếm.

---

## 📂 Cấu trúc lớp chính
- `abstract class BankAccount`
  - Thuộc tính: `AccountNumber`, `OwnerName`, `Balance`, `CreatedAt`
  - Phương thức: `Deposit()`, `Withdraw()`, `ToString()`
- `SavingsAccount` (tài khoản tiết kiệm) — có lãi suất, implement `IInterestBearing`
- `CheckingAccount` (tài khoản thanh toán) — có phí giao dịch, implement `IFeeDeductible`
- `CreditAccount` (tài khoản tín dụng, tùy chọn) — có hạn mức chi tiêu
- `Transaction` — lưu lịch sử giao dịch
- `Bank` — quản lý danh sách tài khoản + giao dịch

---

## ⚠️ Ngoại lệ tùy chỉnh
- `NegativeAmountException`
- `InsufficientFundsException`
- `OverdraftLimitExceededException`
- `DuplicateAccountException`
- (Optional) `AccountNotFoundException`, `TransactionParseException`

---

## 📖 Tính năng
1. Tạo tài khoản (tiết kiệm, thanh toán, tín dụng)
2. Nạp tiền
3. Rút tiền
4. Áp lãi suất / phí định kỳ (đa hình qua interface)
5. Tra cứu chi tiết tài khoản
6. Liệt kê tài khoản (lọc theo loại)
7. Thống kê: tổng số dư, tài khoản cao/thấp nhất, sắp xếp theo số dư
8. Lịch sử giao dịch (lọc theo số TK, ngày)
9. (Nâng cao) Nhập/Xuất CSV/JSON
10. Thoát chương trình

---

## ▶️ Cách chạy
### Yêu cầu
- .NET 6.0 trở lên (cài [tại đây](https://dotnet.microsoft.com/download))

### Build & Run
```bash
git clone https://github.com/<your-username>/MiniBank.git
cd MiniBank
dotnet run
