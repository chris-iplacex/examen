#!/usr/bin/env bash
set -euo pipefail

ACTIVE_FILE=".deployment/active-slot.txt"
TARGET="${1:-}"

if [[ -z "$TARGET" || ( "$TARGET" != "blue" && "$TARGET" != "green" ) ]]; then
  echo "Uso: ./switch.sh [blue|green]"
  exit 1
fi

mkdir -p .deployment
echo "$TARGET" > "$ACTIVE_FILE"

if [[ "$TARGET" == "blue" ]]; then
  cp nginx.blue.conf nginx.conf
else
  cp nginx.green.conf nginx.conf
fi

docker compose exec proxy nginx -t
docker compose exec proxy nginx -s reload
echo "Tráfico cambiado a $TARGET"