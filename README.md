# 🚀 TeleStream  
**Real-Time Telecommunication Event Streaming Using Apache Kafka**

---

## ✅ Apache Kafka Commands for Windows (Using `.bat` Files)  
**(For Kafka versions < 3.x that use ZooKeeper)**

```bat
:: 🧱 1. Start ZooKeeper (if required)
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

:: 🚀 2. Start Kafka Server (Broker)
bin\windows\kafka-server-start.bat config\server.properties

:: 🧪 3. Create a Topic
bin\windows\kafka-topics.bat --create --topic my-first-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

:: 📋 4. List All Topics
bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

:: 🔍 5. Describe a Topic
bin\windows\kafka-topics.bat --describe --topic my-first-topic --bootstrap-server localhost:9092

:: 📤 6. Produce (Send) Messages to a Topic
bin\windows\kafka-console-producer.bat --topic my-first-topic --bootstrap-server localhost:9092

:: 📥 7. Consume (Read) Messages from a Topic
bin\windows\kafka-console-consumer.bat --topic my-first-topic --bootstrap-server localhost:9092 --from-beginning

:: 👥 8. Consume Messages as a Consumer Group
bin\windows\kafka-console-consumer.bat --topic my-first-topic --bootstrap-server localhost:9092 --group my-group

:: ❌ 9. Delete a Topic
bin\windows\kafka-topics.bat --delete --topic my-first-topic --bootstrap-server localhost:9092

:: 🧹 10. Purge Kafka Logs (Optional for Reset)
del /s /q kafka-logs\* logs\*
:: Description: Deletes old log files (⚠️ this wipes topic data).

:: 🧾 11. Create a Topic with Custom Config (Optional)
bin\windows\kafka-topics.bat --create --topic custom-topic --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1 --config cleanup.policy=compact

:: 🗃️ 12. List All Consumer Groups
bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --list

:: 📦 13. Describe a Consumer Group
bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --describe --group my-group
