#!/bin/bash

echo "🧪 Running All Looping Assignment Tests..."

# Make sure we're in the right directory
cd "$(dirname "$0")/.."

# Run all tests
echo "📋 Running all tests..."
mvn test --batch-mode

if [ $? -eq 0 ]; then
    echo "✅ All tests passed! Great job!"
else
    echo "❌ Some tests failed. Check your implementation."
    exit 1
fi
