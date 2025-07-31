<template>
    <div class="home-container">
        <!-- 页面标题 -->
        <header class="page-header">
            <h1>排课系统</h1>
            <p>高效管理课程安排，轻松调整教学计划</p>
        </header>

        <!-- 主要内容区 -->
        <main class="main-content">
            <div class="card">
                <h2>快速操作</h2>
                <div class="action-buttons">
                    <button class="btn primary">查看课表</button>
                    <button class="btn secondary">调整课程</button>
                    <button class="btn tertiary">导出数据</button>
                </div>
            </div>
        </main>

        <!-- 页脚 -->
        <footer class="page-footer">
            <p>© 2024 排课系统 - 版权所有</p>
        </footer>
    </div>
</template>

<script setup>
// 可以在这里添加页面逻辑
// 例如：从API获取数据、处理用户交互等
</script>

<style scoped>
.home-container {
    width: 100vw;
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    background-color: #f5f7fa;
}

.page-header {
    padding: 2rem 1rem;
    text-align: center;
    background-color: #409eff;
    color: white;
}

.page-header h1 {
    margin: 0 0 0.5rem 0;
    font-size: 2.5rem;
}

.page-header p {
    margin: 0;
    font-size: 1.2rem;
    opacity: 0.9;
}

.main-content {
    flex: 1;
    max-width: 1200px;
    width: 100%;
    margin: 2rem auto;
    padding: 0 1rem;
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
    gap: 1.5rem;
}

.card {
    background-color: white;
    border-radius: 8px;
    padding: 1.5rem;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.card h2 {
    margin: 0 0 1rem 0;
    color: #303133;
    border-bottom: 1px solid #eee;
    padding-bottom: 0.5rem;
}

.action-buttons {
    display: flex;
    flex-direction: column;
    gap: 1rem;
}

.btn {
    padding: 0.8rem 1.2rem;
    border: none;
    border-radius: 4px;
    font-size: 1rem;
    cursor: pointer;
    transition: all 0.2s;
}

.btn.primary {
    background-color: #409eff;
    color: white;
}

.btn.secondary {
    background-color: #67c23a;
    color: white;
}

.btn.tertiary {
    background-color: #e6a23c;
    color: white;
}

.btn:hover {
    opacity: 0.9;
    transform: translateY(-2px);
}

.status-info p {
    margin: 0.8rem 0;
    color: #606266;
    line-height: 1.6;
}

.page-footer {
    text-align: center;
    padding: 1.5rem;
    color: #909399;
    border-top: 1px solid #eee;
}
</style>
